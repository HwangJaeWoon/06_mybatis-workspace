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

	<h3>회원 검색 결과</h3>

	<c:choose>
		<c:when test="${ empty list }">
			검색 결과가 없습니다.
		</c:when>
		<c:otherwise>
			<form action="${ contextPath }/delete.me" method="post">
				<table border=1>
					<thead>
						<tr>
							<th></th>
							<th>번호</th>
							<th>아이디</th>
							<th>이름</th>
							<th>주소</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="m" items="${ list }">
							<tr>
								<td><input type="checkbox" name="delNo" value="${ m.userNo }"></td>
								<td>${ m.userNo }</td>
								<td>${ m.userId }</td>
								<td>${ m.userName }</td>
								<td>${ m.userAddress }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<button type="submit">탈퇴</button>
			</form>
		</c:otherwise>
	</c:choose>
	

</body>
</html>