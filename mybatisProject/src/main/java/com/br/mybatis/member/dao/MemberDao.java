package com.br.mybatis.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.br.mybatis.member.dto.MemberDto;

public class MemberDao {

	public MemberDto selectMember(SqlSession sqlSession, int userNo) {
		
		return sqlSession.selectOne("memberMapper.selectMember", userNo);
	}

	public int updateMember(SqlSession sqlSession, MemberDto m) {
		return sqlSession.update("memberMapper.updateMember", m);
	}
	
	public List<MemberDto> selectSearchList(SqlSession sqlSession, Map<String, Object> map) {
		return sqlSession.selectList("memberMapper.searchMember", map);
	}
	
	public int deleteMember(SqlSession sqlSession, String[] deleteNo) {
		
		return sqlSession.update("memberMapper.deleteMember", deleteNo);
	}
}
