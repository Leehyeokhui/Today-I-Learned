<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("name", "가길동");   
request.setAttribute("tot", 190);   
request.setAttribute("avg", 95);   

String name = (String)request.getAttribute("name");
int tot = (Integer)request.getAttribute("tot");
int avg = (Integer)request.getAttribute("avg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
	<% out.print("성명 : " + name + "<br>");
	   out.print("총점 : " + tot + "<br>");
	   out.print("가산점 : " + (tot+5) + "<br>");   
	   out.print("평균 : " + avg + "<br>");   
	%>
<br><br>
	성명 : ${name }<br><br>
	총점 : ${tot }<br><br>
	가산점 : ${tot+5}<br><br>
	평균 : ${avg }점<br><br>
</h2>
</body>
</html>