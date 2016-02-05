/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.config.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

import com.min.config.druid.DruidConfig;
import com.min.config.jdbc.JdbcConfig;

/**
 * 
 * @author Jason.Wang
 * @version $Id: AppConfig.java, v 0.1 2015年8月1日 下午3:53:04 Jason.Wang Exp $
 */
@Configuration
// 自动扫描当前包
@ComponentScan(basePackages = { "com.min.model", "com.min.service" }, excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { Controller.class }) })
// 启动切片自动代理功能
@EnableAspectJAutoProxy(proxyTargetClass = true)
// 导入其他的配置文件信息
@Import({ JdbcConfig.class, DruidConfig.class })
public class AppConfig {
	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class.getCanonicalName());

	static {
		logger.debug("========================================{}======================================", "AppConfig被调用了");
	}
}
