/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.config.datasource;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @author Jason.Wang
 * @version $Id: DataSourceConfig.java, v 0.1 2015年8月8日 下午2:03:32 Jason.Wang Exp $
 */
@Configuration
// 读取配置文件
@PropertySource({ "classpath:/jdbc/jdbc.properties" })
public class DataSourceConfig {
	private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class.getCanonicalName());

	@Value("${jdbc.driverClassName}")
	private String driverClassName;

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	static {
		logger.debug("==============================================初始化DataSourceConfig==============================================");
	}

	/**
	 * 配置数据库的连接池信息
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
	@Bean(name = "dataSource", initMethod = "init", destroyMethod = "close", autowire = Autowire.BY_TYPE)
	public DataSource dataSource() {
		logger.debug("======================================== 初始化数据库连接池开始 ================================================");
		DruidDataSource dataSource = new DruidDataSource();

		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		/**
		 * 设置数据库类型
		 */
		dataSource.setDbType("mysql");
		/**
		 * 连接池最大使用连接数
		 */
		dataSource.setMaxActive(20);
		/**
		 * 初始化连接大小
		 */
		dataSource.setInitialSize(1);
		/**
		 * 获取连接最大等待时间
		 */
		dataSource.setMaxWait(60000);
		/**
		 * 连接池最小空闲
		 */
		dataSource.setMinIdle(3);
		/**
		 * 自动清除无用连接
		 */
		dataSource.setRemoveAbandoned(true);
		/**
		 * 清除无用连接的等待时间
		 */
		dataSource.setRemoveAbandonedTimeout(180);
		/**
		 * 连接属性
		 */
		dataSource.setConnectionProperties("clientEncoding=UTF-8");
		/**
		 * 使用druid监控必须的配置
		 */
		try {
			dataSource.setFilters("stat,wall");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		logger.debug("======================================== 初始化数据库连接池结束 ================================================");
		return dataSource;
	}

	/**
	 * MyBatis SqlSessionFactoryBean 的配置
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
	@Bean(name = "sqlSessionFactory", autowire = Autowire.BY_TYPE)
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		Properties properties = new Properties();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/mybatis/mybatis-config.xml"));
		properties.setProperty("mapperLocations", "classpath:me/kany/spring/mvc/mapper/*.xml");
		sqlSessionFactoryBean.setConfigurationProperties(properties);
		return sqlSessionFactoryBean;
	}

}
