package com.br.mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.mybatis.member.dto.MemberDto;
import com.br.mybatis.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberUpdateController
 */
@WebServlet("/update.me")
public class MemberUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDto m = new MemberDto();
		m.setUserNo(Integer.parseInt(request.getParameter("userNo")));
		m.setUserName(request.getParameter("userName"));
		m.setPhone(request.getParameter("phone"));
		m.setEmail(request.getParameter("email"));
		m.setAddress(request.getParameter("address"));
		m.setInterest(request.getParameterValues("interest"));
		
		int result = new MemberServiceImpl().updateMember(m);
		
		if(result > 0) {
			System.out.println("수정 성공");
			response.sendRedirect(request.getContextPath());
		}else {
			System.out.println("수정 실패");
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
