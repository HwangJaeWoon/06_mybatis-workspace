package com.br.mybatis.notice.service;

import java.util.List;

import com.br.mybatis.common.dto.PageInfoDto;
import com.br.mybatis.notice.dto.NoticeDto;

public interface NoticeService {

	// 모든 메소드들은 추상메소드로 작성 == 묵시적으로 public abstract
	
	// 공지사항 등록
	int insertNotice(NoticeDto n);
	
	// 공지사항 상세조회
	NoticeDto selectNotice(int noticeNo);
	
	// 공지사항 목록조회 (페이징 x)
	List<NoticeDto> selectList();
	
	// 공지사항 목록조회 (페이징 o)
	int selectListCount();
	List<NoticeDto> selectList(PageInfoDto pi);
	
}
