<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>외부 파일에 자바스크립트 작성</title>
<script src="lib.js">
</script>
</head>
<body>
<h3>마우스 올려 보세요</h3>
<hr>
<img src="../media/apple.png" alt="이미지"
		onmouseover="over(this)"
		onmouseout="out(this)">
</body>
</html>