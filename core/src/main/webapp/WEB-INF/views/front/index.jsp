<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="../common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>文章列表</title>
	</head>
	<body>
		<div class="main">
			<div class="content">
				<form id="infolist_form" name="infolist_form" action="info/add.do" method="post">
					<input type="hidden" id="infoId" name="infoId" value="0" />
					<div class="title"><span>文章列表</span><span style="float: right;margin-right: 12px;"><a id="info_add" href="javascript:void(0);" style="color: rgb(196, 79, 79);">+添加</a></span></div>
					<table border="0" cellspacing="0" cellpadding="0" class="list-table">
						<tr>
							<th width="80"><input type="checkbox" name="allCheck"/></th>
							<th>标题</th>
							<th>链接地址</th>
							<th>操作</th>
						</tr>
					</table>
					<ul id="sortable" class="list-ul">
						<c:forEach var="obj" items="${syonlines}">
							<li id="${obj.id}">
								<table border="0" cellspacing="0" cellpadding="0" class="list-table">
									<tr>
										<td width="80"><input type="checkbox" name="id" value="${obj.id}"/></td>
										<td>${obj.ip}</td>
										<td>${obj.loginname}</td>
										<td data-id="${obj.id}"><a class="info_edit" href="javascript:void(0);">编辑</a></td>
									</tr>
								</table>
							</li>
						</c:forEach>
					</ul>
				</form>
			</div>
		</div>
		<link rel='stylesheet' href='<%=basePath %>/public/css/common.css' type='text/css' media='all' />
	    <script src="<%=basePath %>/public/script/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${basePath}/public/script/jquery.ui.core.js" ></script>
		<script type="text/javascript" src="${basePath}/public/script/jquery.ui.widget.js" ></script>
		<script type="text/javascript" src="${basePath}/public/script/jquery.ui.mouse.js" ></script>
		<script type="text/javascript" src="${basePath}/public/script/jquery.ui.sortable.js" ></script>
	    <script src="<%=basePath %>/public/script/info/list.js"></script>
	</body>
</html>