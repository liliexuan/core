/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.startup;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.min.config.SpringWebConfig;
import com.min.config.main.AppConfig;

/**
 * 所有实现了WebApplicationInitializer接口的类都会在容器启动时自动被加载运行，用@Order注解设定加载顺序
 * 这是servlet3.0+后加入的特性，web.xml中可以不需要配置内容，都硬编码到WebApplicationInitializer的实现类中
 * @author Jason.Wang
 * @version $Id: ApplicationInitializer.java, v 0.1 2015年8月1日 下午3:38:42 Jason.Wang Exp $
 */
@Order(3)
//Spring DispatcherServlet的配置,其它Servlet和监听器等需要额外声明，用@Order注解设定启动顺序
public class ApplicationDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationDispatcherServletInitializer.class.getCanonicalName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		/*
		 * 应用上下文，除web部分
		 */
		logger.debug("======================================== {} ======================================", "初始化服务器根节点配置");
		return new Class[] { AppConfig.class };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		/*
		 * web上下文
		 */
		logger.debug("======================================== {} ======================================", "初始化服务器Spring Servlet配置");
		return new Class[] { SpringWebConfig.class };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		logger.debug("======================================== {} ======================================", "初始化服务器Mapping配置");
		return new String[] { "/" };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletFilters()
	 */
	@Override
	protected Filter[] getServletFilters() {
		/**
		 * 注册过滤器，映射路径与DispatcherServlet一致，路径不一致的过滤器需要注册到另外的WebApplicationInitializer中
		 */
		logger.debug("======================================== {} ======================================", "设置服务器编码");
		/**
		 * 配置编码格式的Filter
		 */
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return new Filter[] { characterEncodingFilter };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#customizeRegistration(javax.servlet.ServletRegistration.Dynamic)
	 */
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		/**
		 * 可以注册DispatcherServlet的初始化参数，等等
		 */
		super.customizeRegistration(registration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#registerServletFilter(javax.servlet.ServletContext, javax.servlet.Filter)
	 */
	@Override
	protected FilterRegistration.Dynamic registerServletFilter(ServletContext servletContext, Filter filter) {
		return super.registerServletFilter(servletContext, filter);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#createRootApplicationContext()
	 */
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		/**
		 * 创建一个可以在非spring管理bean中获得spring管理的相关bean的对象：CP_SpringContext.getBean(String beanName)
		 */
		WebApplicationContext applicationContext = super.createRootApplicationContext();
		return applicationContext;
	}
}
