<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
code 파라미터(스크립틀릿)<br>
<%
	String code = request.getParameter("code");
	out.print(code);
%><br>
code 파라미터(el) : ${param.code}<br>
</h2>
</body>
</html>