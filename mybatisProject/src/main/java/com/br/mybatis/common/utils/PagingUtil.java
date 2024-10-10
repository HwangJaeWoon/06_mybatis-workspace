package com.br.mybatis.common.utils;

import com.br.mybatis.common.dto.PageInfoDto;

public class PagingUtil {

	// listCount, currentPage, pageLimit, boardLimit 전달받아
	// maxPage, startPage, endPage 구해서
	// 최종적으로 PageInfoDto에 담아서 반환
	public static PageInfoDto getPageInfoDto(int listCount, int currentPage,int pageLimit, int boardLimit) {
		int maxPage = (int)Math.ceil((double)listCount/boardLimit);
		int startPage = (currentPage -1) / pageLimit * pageLimit + 1;
		int endPage = startPage + pageLimit - 1;
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		return new PageInfoDto(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
		
	}
	
	
}
