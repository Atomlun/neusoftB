package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Favorite;
import com.service.collectservice;
import com.service.impl.collectserviceimpl;

/**
 * Servlet implementation class collect
 */
@WebServlet("/collect")
public class collect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public collect() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	 int j = Integer.parseInt(request.getParameter("uid"));//转换数据类型
     int i = Integer.parseInt(request.getParameter("poid"));//转换数据类型
		
     collectservice service =new collectserviceimpl(); //实例化
     String result ="ok";
     int y = service.insert(i,j);
      if (y>0){
    	  result="success";
    	  response.getWriter().write("<script type='text/javascript'>alert('success');window.localtion.href='single.jsp'</script>");
      }else{
    	  response.getWriter().write("<script type='text/javascript'>alert('fail');window.localtion.href='single.jsp'</script>");
      }
     request.getSession().setAttribute("result",result);//输出结果
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
