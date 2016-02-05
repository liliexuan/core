/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.startup;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

import net.bull.javamelody.MonitoringFilter;
import net.bull.javamelody.SessionListener;

/**
 * Description: <web.xml通用设置>. 配置相关Listener，servlet，filter等等
 * 
 * @author Jason.Wang
 * @version $Id: WebInitializer.java, v 0.1 2015年8月8日 下午2:16:40 Jason.Wang Exp $
 */
@Order(1)
// Spring DispatcherServlet的配置,其它Servlet和监听器等需要额外声明，用@Order注解设定启动顺序
public class WebInitializer implements WebApplicationInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/**
		 * 注册数据库的druidWebStat数据库监控
		 */
		FilterRegistration.Dynamic druidWebStatFilterRegistration = servletContext.addFilter("druidWebStat", WebStatFilter.class);
		druidWebStatFilterRegistration.setInitParameter("exclusions", "/css/*,/style/*,/jslib/*,*.js,*.css,/druid*,/attached/*,/uploadFile/*,*.jsp");
		druidWebStatFilterRegistration.setInitParameter("principalSessionName", "druidWebStat");
		druidWebStatFilterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/");
		StatViewServlet statViewServlet = new StatViewServlet();
		ServletRegistration.Dynamic servletDynamic = servletContext.addServlet("druidweb", statViewServlet);
		servletDynamic.setLoadOnStartup(1);
		servletDynamic.addMapping("/druid/*");
		/**
		 * 添加Javamelody监控
		 */
		MonitoringFilter monitoringFilter = new MonitoringFilter();
		FilterRegistration.Dynamic monitoringFilterRegistration = servletContext.addFilter("monitoring", monitoringFilter);
		monitoringFilterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/");
		/**
		 * Javamelody Session监控
		 */
		servletContext.addListener(SessionListener.class);
	}

}
