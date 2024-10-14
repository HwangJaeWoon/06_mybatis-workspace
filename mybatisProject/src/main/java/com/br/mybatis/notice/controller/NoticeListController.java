package com.br.mybatis.notice.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.mybatis.common.dto.PageInfoDto;
import com.br.mybatis.common.utils.PagingUtil;
import com.br.mybatis.notice.dto.NoticeDto;
import com.br.mybatis.notice.service.NoticeServiceImpl;

/**
 * Servlet implementation class NoticeListController
 */
@WebServlet("/list.no")
public class NoticeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("page") == null) {
			
			// 페이징 처리 안하는 경우
			List<NoticeDto> list = new NoticeServiceImpl().selectList();
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/views/notice/noticeList.jsp").forward(request, response);
		}else {
			
			// 페이징 처리 하는 경우
			int currentPage = Integer.parseInt(request.getParameter("page"));
			int listCount = new NoticeServiceImpl().selectListCount();
			
			PageInfoDto pi = PagingUtil.getPageInfoDto(listCount, currentPage, 5, 5);
			List<NoticeDto> list = new NoticeServiceImpl().selectList(pi);
			
			request.setAttribute("pi", pi);
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("/WEB-INF/views/notice/noticePagingList.jsp").forward(request, response);
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
