package com.br.mybatis.notice.service;

import static com.br.mybatis.common.template.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.br.mybatis.common.dto.PageInfoDto;
import com.br.mybatis.notice.dao.NoticeDao;
import com.br.mybatis.notice.dto.NoticeDto;

public class NoticeServiceImpl implements NoticeService {

	private NoticeDao noticeDao = new NoticeDao();
	
	@Override
	public int insertNotice(NoticeDto n) {
		
		SqlSession sqlSession = /* Template. */getSqlSession();
		
		int result = noticeDao.insertNotice(sqlSession, n);
		
		if(result > 0) {
			sqlSession.commit();
		}
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public NoticeDto selectNotice(int noticeNo) {
		
		SqlSession sqlSession = getSqlSession();
		NoticeDto n = noticeDao.selectNotice(sqlSession, noticeNo);
		
		sqlSession.close();
		return n;
	}

	@Override
	public List<NoticeDto> selectList() {
		
		SqlSession sqlSession = getSqlSession();
		List<NoticeDto> list = noticeDao.selectList(sqlSession);
		sqlSession.close();		
		return list;
	}

	@Override
	public int selectListCount() {
		SqlSession sqlSession = getSqlSession();
		int listCount = noticeDao.selectListCount(sqlSession);
		sqlSession.close();
		return listCount;
	}

	@Override
	public List<NoticeDto> selectList(PageInfoDto pi) {
		SqlSession sqlSession = getSqlSession();
		List<NoticeDto> list = noticeDao.selectList(sqlSession, pi);
		sqlSession.close();
		return list;
	}

}
