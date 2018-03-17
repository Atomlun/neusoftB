package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Post;
import com.service.PostService;
import com.service.impl.PostServiceImpl;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
	
		String searchKeyword= request.getParameter("searchKeyword");
		
		PostService searchResultService = new PostServiceImpl();
		
		List<Post> srlist = searchResultService.searchPostListByKeyword(searchKeyword);
		
		request.setAttribute("srlist", srlist);
		
		request.getRequestDispatcher("searchResult.jsp").forward(request, response);
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
