<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본페이지</title>
</head>
<body>
<h1>기본페이지 입니다.</h1>
<c:choose>  
<c:when test="${empty param.name }">
	<p style="font-size: Large; color: olive;">index 페이지 입니다.</p>
</c:when>
<c:otherwise>
	<p style="font-size: Large; color: orange;">${param.name }님 안녕하세요~~~</p>
</c:otherwise>
</c:choose>
</body>
</html>