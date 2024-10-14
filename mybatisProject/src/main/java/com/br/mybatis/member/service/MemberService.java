package com.br.mybatis.member.service;

import java.util.List;
import java.util.Map;

import com.br.mybatis.member.dto.MemberDto;

public interface MemberService {

	// 회원정보 상세조회
	MemberDto selectMember(int userNo);
	
	// 회원정보 변경
	int updateMember(MemberDto m);
	
	// 회원 검색
	List<MemberDto> selectSearchList(Map<String, Object> map);
	
	// 회원 다중 탈퇴
	int deleteMember(String[] delecteNo);
	
	
	
}
