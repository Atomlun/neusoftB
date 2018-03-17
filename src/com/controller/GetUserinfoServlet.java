package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Follower;
import com.entity.Userinfo;
import com.service.FollowerService;
import com.service.UserinfoService;
import com.service.impl.FollowerServiceImpl;
import com.service.impl.UserinfoServiceImpl;

@WebServlet("/getUserinfo")
public class GetUserinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetUserinfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("action");
		
		// 声明Userinfo对象
		Userinfo userinfo = null; 
		
		Userinfo myUserinfo =(Userinfo) request.getSession().getAttribute("user");
		// 获取页面传输的uid参数
		String tempStr =  request.getParameter("uid");
		
		int uid = 0; 
		// 判断页面传输uid参数是否为空
		
		boolean isFollowed = false;
		
		if (tempStr != null ){
			// 不为空则获取该uid对应的用户详细信息Userinfo
			UserinfoService userinfoService = new UserinfoServiceImpl();
			uid = Integer.parseInt(tempStr);
			userinfo = userinfoService.getUserinfoByUid(uid);
			
			FollowerService followerService = new FollowerServiceImpl();
			isFollowed = followerService.getFollowerByUid(uid,myUserinfo.getUid()).isEmpty()?false:true;
			
			
			
		}else{
			// 为空则获取已登陆用户的详细信息
			userinfo = myUserinfo;
		}
		
		System.out.println(isFollowed);
		
		request.setAttribute("userinfo", userinfo);
		request.setAttribute("isFollowed", isFollowed);

		if("update".equals(action)){
			
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}else {
			
			request.getRequestDispatcher("userinfo.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
