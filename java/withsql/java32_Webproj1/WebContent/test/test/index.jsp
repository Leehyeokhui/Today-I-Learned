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
<h3><a href = "${pageContext.request.contextPath }/Join">ȸ������</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Login">�α���</a></h3>
<h3><a href = "${pageContext.request.contextPath }/MemList">�����</a></h3>
</c:if>
<c:if test = "${not empty sessionScope.id }">
${sessionScope.id }�� �α��� ��
<h3><a href = "${pageContext.request.contextPath }/MyInfo">������ ����</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Logout">�α׾ƿ�</a></h3>
<h3><a href = "${pageContext.request.contextPath }/Out">Ż��</a></h3>
<h3><a href = "${pageContext.request.contextPath }/NotionBoard">�Խ���</a></h3>
</c:if>
</body>
</html>

<!--  �Խ��� Ŭ�� table��
 �۹�ȣ �ۼ��� �۸�� �ۼ���
 table���� ���ۼ� ��ũ -> �ۼ�form���� ����, ���� -->