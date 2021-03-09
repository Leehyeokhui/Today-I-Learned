<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "el.*" %>
<%
	ELDTO dto = new ELDTO("다이엘 레드클리프", "해리포터와 불의 잔");
	request.setAttribute("dto", dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
	EL 사용하지 않은 경우 <br><br>
	<%
		Object obj = request.getAttribute("dto");
		ELDTO eldto = (ELDTO)obj;
		
		out.print("영화명 : " + eldto.getMovie() + "<br><br>");
		out.print("주연 : " + eldto.getName() + "<br><br>");
	%>
	<br>
	EL 사용한 경우 <br><br>
	영화명 : ${requestScope.dto.movie}<br><br>
	주연 : ${dto.name}<br><br>
	Type2 : ${dto.movie}-${dto.name}<br><br>
	Type3 : ${requestScope.movie}<br><br>
	Type4 : ${movie}<br><br>
</h2>
</body>
</html>