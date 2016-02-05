/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
 * @author Jason.Wang
 * @version $Id: WebConfig.java, v 0.1 2015年8月1日 下午3:47:48 Jason.Wang Exp $
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.min.controller")
public class SpringWebConfig extends WebMvcConfigurerAdapter {

    /**
     * 设置Views
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
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addFormatters(org.springframework.format.FormatterRegistry)
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        super.addFormatters(registry);
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureContentNegotiation(org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer)
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        super.configureContentNegotiation(configurer);
        configurer.favorParameter(true);
        configurer.favorPathExtension(true);
        configurer.ignoreAcceptHeader(true);
        configurer.mediaType("xml", MediaType.TEXT_XML);
        configurer.mediaType("json", MediaType.APPLICATION_JSON);
        configurer.parameterName("_format");
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureMessageConverters(java.util.List)
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.addAll(messageConverters());
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addArgumentResolvers(java.util.List)
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //@Form
        super.addArgumentResolvers(argumentResolvers);
    }

    /**
     * 返回rest视图（String 、xml、json）
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
    public List<HttpMessageConverter<?>> messageConverters() {
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setWriteAcceptCharset(false);
        ArrayList<MediaType> textTypes = new ArrayList<MediaType>();
        textTypes.add(MediaType.TEXT_PLAIN);
        textTypes.add(MediaType.TEXT_HTML);
        textTypes.add(MediaType.TEXT_XML);
        textTypes.add(MediaType.APPLICATION_XML);
        textTypes.add(MediaType.APPLICATION_JSON);
        stringConverter.setSupportedMediaTypes(textTypes);
        converters.add(stringConverter);
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new ResourceHttpMessageConverter());
        converters.add(new SourceHttpMessageConverter<Source>());
        converters.add(new AllEncompassingFormHttpMessageConverter());
        converters.add(new FastJsonHttpMessageConverter());
        return converters;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //配置公共访问资源
        registry.addResourceHandler("/public/**").addResourceLocations("/public/");
        registry.addResourceHandler("/favicon.ico").addResourceLocations("/public/favicon.ico");
    }

    /**
     * 添加拦截器
     */
    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }
}
