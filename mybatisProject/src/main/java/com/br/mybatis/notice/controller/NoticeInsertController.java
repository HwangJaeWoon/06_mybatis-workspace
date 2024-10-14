package com.br.mybatis.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.mybatis.notice.dto.NoticeDto;
import com.br.mybatis.notice.service.NoticeServiceImpl;

/**
 * Servlet implementation class NoticeInsertController
 */
@WebServlet("/insert.no")
public class NoticeInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		NoticeDto n = new NoticeDto();
		n.setNoticeTitle(request.getParameter("title"));
		n.setNoticeContent(request.getParameter("content"));
		//n.setNoticeWriter(세션에 담겨있는 로그인한 회원의 회원번호);
		n.setNoticeWriter("1"); // 1번 회원이라는 가정하로
		
		int result = new NoticeServiceImpl().insertNotice(n);
		
		if(result > 0) {
			System.out.println("공지사항 등록 성공");
			response.sendRedirect(request.getContextPath());
		}else {
			System.out.println("공지사항 등록 실패");
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
