/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.config.jdbc;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.min.config.datasource.DataSourceConfig;

/**
 * 配置数据库连接，采用的是阿里的DruidDataSource连接的配置方式
 * 
 * @author Jason.Wang
 * @version $Id: JdbcConfig.java, v 0.1 2015年8月1日 下午3:55:28 Jason.Wang Exp $
 */
@Configuration
// 启用注解事务管理，使用CGLib代理
@EnableTransactionManagement(proxyTargetClass = true)
// 导入需要的包
@Import({ DataSourceConfig.class })
public class JdbcConfig {
	private static final Logger logger = LoggerFactory.getLogger(JdbcConfig.class.getCanonicalName());

	static {
		logger.debug("========================================{}======================================", "初始化DataSourceConfig");
	}

	/**
	 * 负责解析资源文件，必须为Static的方法
	 * 
	 * @author Jason.Wang
	 * @createdate 2015年8月8日
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer placehodlerConfigurer() {
		logger.debug("========================================{}======================================", "PropertySourcesPlaceholderConfigurer");
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}

	@Resource(name = "dataSource")
	private DataSource dataSource;

	/**
	 * Spring与MyBatis整合配置，扫描所有Mapper.java
	 * 
	 * @author Jason.Wang
	 * 
	 *         <pre>
	 * 		  /\_/\
	 *		=( °w° )=
	 * 		  )   (  //
	 * 		 (__ __)//
	 *         </pre>
	 * 
	 * @createdate 2015年8月1日
	 * @return
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.min.mapper");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return mapperScannerConfigurer;
	}

	/**
	 * 配置数据库事物管理
	 * 
	 * @author Jason.Wang
	 * 
	 *         <pre>
	 * 		  /\_/\
	 *		=( °w° )=
	 * 		  )   (  //
	 * 		 (__ __)//
	 *         </pre>
	 * 
	 * @createdate 2015年8月1日
	 * @return
	 */
	@Bean(name = "transactionManager", autowire = Autowire.BY_NAME)
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
