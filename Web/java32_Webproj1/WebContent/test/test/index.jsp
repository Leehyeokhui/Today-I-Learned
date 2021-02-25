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
<c:if test = "${empty sessionScope.id }">
${joinMsg }
<h3><a href = "${pageContext.request.contextPath }/Join">회원가입</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Login">로그인</a></h3>
<h3><a href = "${pageContext.request.contextPath }/MemList">모든멤버</a></h3>
</c:if>
<c:if test = "${not empty sessionScope.id }">
${sessionScope.id }님 로그인 중
<h3><a href = "${pageContext.request.contextPath }/MyInfo">내정보 보기</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Logout">로그아웃</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Out">탈퇴</a></h3>
<h3><a href = "${pageContext.request.contextPath }/NotionBoard">게시판</a></h3>
</c:if>
</body>
</html>

<!--  게시판 클릭 table로
 글번호 작성자 글목록 작성일
 table위에 글작성 링크 -> 작성form으로 제목, 내용 -->