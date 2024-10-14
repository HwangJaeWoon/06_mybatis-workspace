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
<style>
	table, tr, th, td{
		border : 1px solid black;
	}
</style>
<body>
	<h3>공지사항 목록 (페이징 o)</h3>
	
	<c:choose>
		<c:when test="${ empty list }">
			존재하는 공지사항이 없습니다
		</c:when>
		<c:otherwise>
			<table>
				<thead>
					<tr>
						<th>글번호</th>
						<th>글제목</th>
						<th>작성자</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${ list }">
						<tr>
							<td>${ n.noticeNo }</td>
							<td>${ n.noticeTitle }</td>
							<td>${ n.noticeWriter }</td>
							<td>${ n.registDate }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div>
				
				<c:if test="${ pi.currentPage ne 1 }">
					<a href="${ contextPath }/list.no?page=${pi.currentPage - 1}">이전</a>
				</c:if>
				
				<c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
					<a href="${ contextPath }/list.no?page=${p}">${ p }</a>
				</c:forEach>
				
				<c:if test="${ pi.currentPage ne pi.maxPage }">
					<a href="${ contextPath }/list.no?page=${pi.currentPage + 1}">다음</a>
				</c:if>
			
								
			</div>
			
		</c:otherwise>
	</c:choose>

</body>
</html>