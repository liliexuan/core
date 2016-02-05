/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.min.uitls.common.MD5;

/**
 * 
 * 
 * @author Jason.Wang
 * @version $Id: BaseController.java, v 0.1 2015年8月1日 下午8:09:52 Jason.Wang Exp $
 */
@SuppressWarnings("serial")
public class BaseController implements Serializable {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass().getCanonicalName());

	public static final String SESSIONMANAGE = "session_manage";

	protected final int pageSize = 80;

	/**
	 * 获取当前站点的访问路径
	 * 
	 * @param request
	 * @return
	 */
	public String getBasePath(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		// 判断如果是80或者443端口就将端口取消
		if (80 == request.getServerPort() || 443 == request.getServerPort()) {
			basePath = request.getScheme() + "://" + request.getServerName() + path + "/";
		} else {
			basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		}
		return basePath;
	}

	/**
	 * 向网页中输出 json 字符串
	 * 
	 * @param response
	 *            输出对象
	 * @param text
	 *            输出文本
	 * @throws IOException
	 */
	public void renderJson(HttpServletResponse response, String text) throws IOException {
		response.setContentType("text/x-json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(text);
		if (null != out) {
			out.close();
		}
	}

	/**
	 * 向网页中输出 html 字符串
	 * 
	 * @param response
	 *            输出对象
	 * @param text
	 *            输出文本
	 * @throws IOException
	 */
	public void renderHtml(HttpServletResponse response, String text) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(text);
		if (null != out) {
			out.close();
		}
	}

	/**
	 * 向网页中输出 html 字符串
	 * 
	 * @param response
	 *            输出对象
	 * @param text
	 *            输出文本
	 * @throws IOException
	 */
	public void renderJavaScript(HttpServletResponse response, String text) throws IOException {
		response.setContentType("text/javascript;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(text);
		if (null != out) {
			out.close();
		}
	}

	/**
	 * 初始化表单提交的formCode
	 */
	protected void initFormCode(HttpServletRequest request) {
		this.destroyFormCode(request);
		String formhash = MD5.getInstance().toDigset32(Long.toString(new Date().getTime()));
		// 生成FormHashCode并放置到Session中
		request.getSession().setAttribute("formhashSession", formhash);
	}

	/**
	 * 判断表单是不是重复提交，并且将HttpServletRequest中的重复提交对象销毁
	 * 
	 * @param formhash
	 * @return boolean
	 */
	protected boolean isRepeating(HttpServletRequest request, String formhash) {
		Object obj_formhash = request.getSession().getAttribute("formhashSession");
		this.destroyFormCode(request);
		if (null != obj_formhash && null != formhash && formhash.equals(obj_formhash.toString())) {
			return false;
		}
		return true;
	}

	/**
	 * 销毁Session中的FormCode
	 */
	protected void destroyFormCode(HttpServletRequest request) {
		request.getSession().removeAttribute("formhashSession");
	}

	/**
	 * 获取当前程序的路径
	 * 
	 * @param request
	 * @return
	 */
	protected String getAppBasePath(HttpServletRequest request) {
		return request.getSession().getServletContext().getRealPath("/") + "attached/";
	}

	/**
	 * 
	 * 获取当前程序的路径
	 * 
	 * @param request
	 * @return
	 */
	protected String getAppUrlPath(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = "";
		if (null != request.getHeader("X-Forwarded-Proto")) {
			if (80 == request.getServerPort() || 443 == request.getServerPort()) {
				basePath = request.getHeader("X-Forwarded-Proto") + "://" + request.getHeader("HOST") + path + "/";
			} else {
				basePath = request.getHeader("X-Forwarded-Proto") + "://" + request.getHeader("HOST") + ":" + request.getHeader("X-Real-Port") + path + "/";
			}
			return basePath;
		} else {
			basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
			// 判断如果是80或者443端口就将端口取消
			if (80 == request.getServerPort() || 443 == request.getServerPort()) {
				basePath = request.getScheme() + "://" + request.getServerName() + path + "/";
			} else {
				basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
			}
			return basePath;
		}
	}

	/**
	 * 通过用户的请求获取用户的ip地址和主机信息
	 * @param request 用户发送的请求
	 * @return String 返回类型 （地址跳转参数）
	 * @throws Exception
	 */
	public String getClientIpAddr(HttpServletRequest request) {
		String ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress))
			ipAddress = request.getHeader("Proxy-Client-IP");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress))
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress))
			ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress))
			ipAddress = request.getHeader("HTTP_CLIENT_IP");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress))
			ipAddress = request.getRemoteAddr();
		return ipAddress;
	}
}
