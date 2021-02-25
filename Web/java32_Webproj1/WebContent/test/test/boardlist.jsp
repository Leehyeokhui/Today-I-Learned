<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3><a href = "${pageContext.request.contextPath }/Write">게시글 작성</a></h3>
<h3>boards</h3>
<c:if test="${empty boardlist }">
등록된 게시글이 없습니다.
</c:if>
<c:if test="${not empty boardlist }">
<table border = "1">
	<tr><th>num</th><th>writer</th><th>title</th><th>w_date</th></tr>
	<c:forEach var="b" items="${boardlist }">
		<tr>
			<td>${b.num }</td><td>${b.writer }</td>
			<td><a href = "${pageContext.request.contextPath }/BoardRead?num=${b.num}">${b.title }</a></td><td>${b.w_date }</td>
		</tr>
	</c:forEach>
</table>
</c:if>
</body>
</html>