<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>지역변수와 전역변수</title>
</head>
<body>
<h3>지역변수와 전역변수</h3>
<hr>
<script>
var x=100; // 전역변수

function f() { // 함수 f() 선언
	var x=1; // 지역변수
	document.write("지역변수 x=" + x);
	document.write("<br>");
	document.write("전역변수 x=" + this.x);
}

f(); // 함수 f() 호출
</script>
</body>
</html>