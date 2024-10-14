<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>

	<h3>회원 상세조회 + 변경</h3>

	<c:choose>
		<c:when test="${ empty m }">
			조회된 회원이 없습니다
		</c:when>
		<c:otherwise>
			<form action="${ contextPath }/update.me" method="post">
				회원번호 : <input type="text" name="userNo" value="${ m.userNo }" readonly> <br>				
				아이디 : <input type="text" name="userId" value="${ m.userId }" readonly> <br>
				이름 : <input type="text" name="userName" value="${ m.userName }"> <br>
			  전화번호 : <input type="text" name="phone" value="${ m.phone }"> <br>
				이메일 : <input type="text" name="email" value="${ m.email }"> <br>
				주소 : <input type="text" name="address" value="${ m.address }"> <br>
				관심분야 :
				<input type="checkbox" name="interest" value="운동"> 운동
				<input type="checkbox" name="interest" value="등산"> 등산
				<input type="checkbox" name="interest" value="낚시"> 낚시
				<input type="checkbox" name="interest" value="요리"> 요리
				<input type="checkbox" name="interest" value="게임"> 게임
				<input type="checkbox" name="interest" value="영화"> 영화
				<br>
				<button type="submit">정보변경</button>
				<script>
					$(function(){
						let interest = '${ fn:join(m.interest, ",")}'; //'등산,요리,게임'
						
						$(":checkbox").each(function(){
							if(interest.search($(this).val()) != -1){
								$(this).prop("checked", true);
							}
						})
					
					})
				</script>
				
			</form>
		</c:otherwise>
	</c:choose>

</body>
</html>