<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "Java개발자");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
	request의 name 속성(표현식 방식) : <%=request.getAttribute("name") %><br>
	request의 name 속성(스크립플릿 방식) : 
	<% String name = (String)request.getAttribute("name");
	   out.print(name);
	%>
	<br>
	request의 name 속성(el 방식) : ${requestScope.name}<br>
	request의 name 속성(el 방식) : ${name}<br>
</h2>
</body>
</html>