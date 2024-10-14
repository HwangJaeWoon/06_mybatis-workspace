package com.br.mybatis.member.service;

import static com.br.mybatis.common.template.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.br.mybatis.member.dao.MemberDao;
import com.br.mybatis.member.dto.MemberDto;

public class MemberServiceImpl implements MemberService {

	private MemberDao memberDao = new MemberDao();
	
	@Override
	public MemberDto selectMember(int userNo) {
		SqlSession sqlSession = getSqlSession();
		MemberDto m = memberDao.selectMember(sqlSession, userNo);
		sqlSession.close();
		return m;
	}

	@Override
	public int updateMember(MemberDto m) {
		SqlSession sqlSession = /* Template. */getSqlSession();
		int result = memberDao.updateMember(sqlSession, m);
		if(result > 0) {
			sqlSession.commit();
		}
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public List<MemberDto> selectSearchList(Map<String, Object> map) {
		SqlSession sqlSession = getSqlSession();
		List<MemberDto> list = memberDao.selectSearchList(sqlSession, map);
		sqlSession.close();		
		return list;
	}
	
	@Override
	public int deleteMember(String[] deleteNo) {
		SqlSession sqlSession = getSqlSession();
		int result = memberDao.deleteMember(sqlSession, deleteNo);
		if(result == deleteNo.length) {
			sqlSession.commit();
		}
		sqlSession.close();
		return result;
	}
	
	

}
