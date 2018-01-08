<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" class="no-js" >
<head>
	<meta charset="utf-8"/>
	<meta name="author" content="" />
	<meta name="keywords" content="" />
	<meta name="viewport" content="width=device-width,initial-scale=1" />
	<title>ZeroTitle-Bootstrap-JSP</title>

	<!-- main JS libs -->
	<script src="${pageContext.request.contextPath}/vanilla-cream-css/js/libs/modernizr.min.js"></script>
	<script src="${pageContext.request.contextPath}/vanilla-cream-css/js/libs/jquery-1.10.0.js"></script>
	<script src="${pageContext.request.contextPath}/vanilla-cream-css/js/libs/jquery-ui.min.js"></script>
	<script src="${pageContext.request.contextPath}/vanilla-cream-css/js/libs/bootstrap.min.js"></script>

	<!-- Style CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/vanilla-cream-css/css/bootstrap.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/vanilla-cream-css/style.css" />
	<!-- scripts -->
	<script src="${pageContext.request.contextPath}/vanilla-cream-css/js/general.js"></script>
</head>
<body style="background-image: none;">
	<div class="body_wrap">
		<div class="container">
			<div class="alert alert-success text-center" role="alert">Sptring Boot学习资源大奉送</div>
			<table class="table table-striped table-bordered">
				<tr>
					<td>作者</td>
					<td>教程名称</td>
					<td>地址</td>
				</tr>
				<c:forEach var="zero" items="${zeroList}">
					<tr class="text-info">
						<td>${zero.author}</td>
						<td>${zero.title}</td>
						<td><a href="${zero.url}" class="btn btn-search btn-green" target="_blank"><span>点我</span></a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
