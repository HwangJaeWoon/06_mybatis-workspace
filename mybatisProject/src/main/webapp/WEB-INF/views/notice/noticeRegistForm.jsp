<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>공지사항 등록</h2>

	<form action="${ contextPath }/insert.no" method="post">
		제목 : <input type="text" name="title"> <br>
		내용 : <textarea name="content"></textarea> <br><br>
		
		<button type="submit">등록하기</button>
	</form>
	
	
</body>
</html>