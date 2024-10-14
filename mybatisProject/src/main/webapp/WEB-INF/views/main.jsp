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

	<%-- 
		* Framework
			1. 개발자가 보다 편리한 환경에서 개발할 수 있도록 제공디되는 틀. 뼈대
			2. 공통적으로 사용되는 라이브러리|개발도구|인터페이스 등을 의미
			3. 장점
				 1) 처음부터 다 만들 필요 없음
				 		ㄴ 이미 만들어진 기능을 가져다 사용만 하면 됨 => 효율성이 높고 품질이 보장됨
				 		ㄴ 개발 시간이 단축됨
				 2) 개발 방법이 이미 정해져있음 (가이드라인을 제공함)
				 		ㄴ 개발의 표준화로 생산성이 높아짐
				 		ㄴ 개발 후 유지보수 및 기능의 확장이 용이함
				 3) 개발자들을 위한 다양한 도구들이 지원됨
			4. 단점
				 1) 습득하는데 오랜 시간이 걸림
				 2) 개발 방법이 정해져있으므로 자유롭고 유연하게 설계 및 코딩하는데 제약이 있음
				 3) Framework에 의존하게 되면 개발 실력이 떨어질 수 있음
			5. 필요성
				 프로젝트 규모가 커질 수록 복잡도도 높아지고 다수의 개발자가 필요함
				 모든 개발자들이 "통일성있게 빠르고 안정적"으로 개발하기 위해 프레임워크가 좋은 대안
			6. 종류
				 1) 영속성 프레임워크
				 		데이터의 CRUD를 보다 편리하게 할 수 있도록 제공해주는 프레임워크
				 			ㄴ SQL Mapper(MyBatis, Hibernate), ORM(JPA) 등
				 2) 자바 프레임워크
				 3) 화면구현 프레임워크
				 4) 기능 및 지원 프레임워크
				 		업무 수행에 도움을 줄 수 있는 기능을 제공하는 프레임워크
				 		  ㄴ Log4j, Junit 등
			* MyBatis Framework
				1. 데이터 CRUD를 xml로 구조화한 Mapper 파일을 통해
					 JDBC 과정을 보다 편리하게 할 수 있는 영속성(Persistence) 프레임워크
				2. 기존의 JDBC 코드의 상당부분을 차지했던 파라미터 설정(? 자리 채우기) 및
					 결과 매핑(rset으로부터 값 뽑아서 자바객체에 담기)을 xml 설정을 통해 쉽게 구현 가능
				3. 동적 쿼리 기능 지원
				4. Apache ibatis => Google MyBatis로 변경
				
			* 세팅
				1. 패키지 생성
					 com.br.mybatis.member.controller
					 											.service
					 											.dao
					 											.dto
					 							 .notice.controller
					 							 				.service
					 							 				.dao
					 							 				.dto
					 							 .common.dto
					 							 				.template
					 							 				.handler
					 							 				.filter
			
				2. 폴더 생성
					 src/main/webapp/WEB-INF/views/notice
					 															/member					 																 															
					 															
	--%>

	<h3>1. insert연습 (공지사항 등록)</h3>
	<a href="${ contextPath }/regist.no">공지사항 등록페이지로 이동</a>

	<h3>2. select연습 - 한행 (공지사항 상세조회)</h3>
	<form action="${ contextPath }/detail.no">
		검색할 글번호 : <input type="text" name="noticeNo">
		<button type="submit">검색</button>
	
	</form>


	<h3>3. select연습 - 여러행 (공지사항 전체목록조회)</h3>
	<a href="${ contextPath }/list.no">공지사항 전체 목록 페이지로 이동</a>

	<h4>4. select연습 - 여러행 + 페이징 처리 - RowBounds 적용</h4>
	<a href="${ contextPath }/list.no?page=1">공지사항 목록 페이지(페이징처리)로 이동</a>
	
	<h5>5. select연습 + update연습 (회원정보 상세조회 + 회원정보 변경) - TypeHandler 적용</h5>
	<form action="${ contextPath }/detail.me">
		검색할 회원번호 : <input type="text" name="userNo">
		<button type="submit">검색</button>
	</form>
	
	<h6>6. 동적쿼리 연습 (회원 검색)</h6>
	<a href="${ contextPath }/search.me">회원 검색 목록 페이지로 이동</a>
	
</body>
</html>