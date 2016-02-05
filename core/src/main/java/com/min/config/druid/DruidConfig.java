/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.config.druid;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;

/**
 * 
 * @author Jason.Wang
 * @version $Id: DruidConfig.java, v 0.1 2015年8月1日 下午8:32:01 Jason.Wang Exp $
 */
@Configuration
@Aspect
public class DruidConfig {
    private static final Logger logger = LoggerFactory.getLogger(DruidConfig.class.getCanonicalName());
    
    /**
     * 
     * @author Jason.Wang
     * <pre>
     * 		  /\_/\
     *		=( °w° )=
     * 		  )   (  //
     * 		 (__ __)//
     * </pre>
     * @createdate 2015年8月1日
     * @return
     */
    @Bean
    public DruidStatInterceptor druidStatInterceptor(){
        DruidStatInterceptor statInterceptor = new DruidStatInterceptor();
        return statInterceptor;
    }
    
    /**
     * 
     * @author Jason.Wang
     * <pre>
     * 		  /\_/\
     *		=( °w° )=
     * 		  )   (  //
     * 		 (__ __)//
     * </pre>
     * @createdate 2015年8月1日
     * @return
     */
    @Bean
    public JdkRegexpMethodPointcut jdkRegexpMethodPointcut(){
        JdkRegexpMethodPointcut jdkRegexpMethodPointcut = new JdkRegexpMethodPointcut();
        jdkRegexpMethodPointcut.setPatterns("com.min.service.*");
        return jdkRegexpMethodPointcut;
    }
    
    /**
     * 
     * @author Jason.Wang
     * <pre>
     * 		  /\_/\
     *		=( °w° )=
     * 		  )   (  //
     * 		 (__ __)//
     * </pre>
     * @createdate 2015年8月1日
     * @return
     */
    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor(){
        logger.debug("======================================切面开始执行===============================================");
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setAdvice(druidStatInterceptor());
        advisor.setPointcut(jdkRegexpMethodPointcut());
        return advisor;
    }
}
