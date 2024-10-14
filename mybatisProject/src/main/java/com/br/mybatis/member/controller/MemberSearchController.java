package com.br.mybatis.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.br.mybatis.member.dto.MemberDto;
import com.br.mybatis.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberSearchController
 */
@WebServlet("/search.me")
public class MemberSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String condition = request.getParameter("condition");
        String keyword = request.getParameter("keyword");

        Map<String, Object> map = new HashMap<>();
        map.put("condition", condition);
        map.put("keyword", keyword);

        List<MemberDto> list = new MemberServiceImpl().selectSearchList(map);

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/views/member/memberList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
