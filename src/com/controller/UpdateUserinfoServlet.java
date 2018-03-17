package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Userinfo;
import com.service.UserinfoService;
import com.service.impl.UserinfoServiceImpl;


@WebServlet("/UpdateUserinfo")
public class UpdateUserinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateUserinfoServlet() {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Userinfo uinfo=new Userinfo();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		String username=request.getParameter("username");
		String sex=request.getParameter("sex");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String birthday=request.getParameter("birthday");
		Date birth = Date.valueOf(birthday);
		
		
		uinfo.setUid(id);
		uinfo.setUname(username);
		uinfo.setSex(sex);
		uinfo.setAddress(address);
		uinfo.setEmail(email);
		uinfo.setBirthday(birth);
		
		System.out.println(username+"----"+sex+"----"+address+"----"+email+"----"+birthday);
		
		UserinfoService service=new UserinfoServiceImpl();
		int rusult=service.UpdateUserinfo(uinfo);
		
		
		
		if(rusult>0){
			request.getSession().setAttribute("user", uinfo);
			  request.getRequestDispatcher("/getUserinfo").forward(request, response);
			  
		}else{
			 request.getRequestDispatcher("/getUserinfo?action=update").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
