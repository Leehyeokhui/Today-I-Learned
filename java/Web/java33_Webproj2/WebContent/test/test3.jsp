<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���������� ��������</title>
</head>
<body>
<h3>���������� ��������</h3>
<hr>
<script>
var x=100; // ��������

function f() { // �Լ� f() ����
	var x=1; // ��������
	document.write("�������� x=" + x);
	document.write("<br>");
	document.write("�������� x=" + this.x);
}

f(); // �Լ� f() ȣ��
</script>
</body>
</html>