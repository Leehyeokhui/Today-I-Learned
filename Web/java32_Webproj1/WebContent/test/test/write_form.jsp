<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�Խñ� �ۼ�</h3>
<form action="${pageContext.request.contextPath }/Write" method="post">
<table border = "1">
<tr><th>title</th><td><input type = "text" name = "title"></td></tr>
<tr><th>content</th><td><input type = "text" name = "content"></td></tr>
<tr><td colspan = "2">
<input type="submit" value="�ۼ��Ϸ�" onclick="check()">
</td></tr>
</table>
</form>
</body>
</html>