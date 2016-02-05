<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	//判断如果是80或者443端口就将端口取消
	if(80 == request.getServerPort() || 443 == request.getServerPort()){
	    basePath = request.getScheme()+"://"+request.getServerName()+path+"/";
	}else{
	    basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	}
%>