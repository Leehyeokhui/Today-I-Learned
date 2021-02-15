<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
//request.getParameter("파람이름"):요청 파라메터 읽음. 문자열로 받음
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String gen = request.getParameter("gen");
String[] hobby = request.getParameterValues("hobby");
int grade = Integer.parseInt(request.getParameter("grade"));
out.print("out 객체로 출력<br/>");
out.print("id:"+id+"<br/>");
out.print("pwd:"+pwd+"<br/>");
out.print("gen:"+gen+"<br/>");
out.print("hobby:");
for(String s:hobby){
	out.print(s);
}
out.print("<br/>");
out.print("grade:"+grade+"<br/>");
%>
<h3>html로 출력</h3>
id:<%=id %><br/>
pwd:<%=pwd %><br/>
gen:<%=gen %><br/>
grade:<%=grade %><br/>
<%
	for(String s:hobby){
%>
	<%=s %><br/>
<%
	}
%>
</body>
</html>