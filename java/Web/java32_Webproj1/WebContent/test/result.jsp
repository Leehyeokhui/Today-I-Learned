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
//request.getParameter("�Ķ��̸�"):��û �Ķ���� ����. ���ڿ��� ����
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String gen = request.getParameter("gen");
String[] hobby = request.getParameterValues("hobby");
int grade = Integer.parseInt(request.getParameter("grade"));
out.print("out ��ü�� ���<br/>");
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
<h3>html�� ���</h3>
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