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
import com.service.UsersService;
import com.service.impl.PostServiceImpl;
import com.service.impl.UsersServiceImpl;
import com.utils.PageUtil;
import com.utils.UsersRanking;

@WebServlet("/show")
public class IndexShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexShowServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		UsersService userservice=new UsersServiceImpl();
		PostService service= new PostServiceImpl();
		
		
		int hotpageNum;
		String hpn= request.getParameter("hotpageNum");
		int recentpageNum ;
		String rpn=request.getParameter("recentpageNum");
		String usersRanking=request.getParameter("usersRanking");
		String action=request.getParameter("action");
		String c=request.getParameter("cyuy");
		String cjiajia=request.getParameter("cjiajia");
		
		int pageSize = 3;
		
		//热帖排行
		if(hpn==null){
			hotpageNum=1;
		}else{
			hotpageNum = Integer.parseInt(request.getParameter("hotpageNum"));
			}
		PageUtil<Post> hotPageUtil =service.getHotPostList(hotpageNum,pageSize);
		//将结果填充到内置对象中
		
		request.getSession().setAttribute("hotPageUtil", hotPageUtil);
		
		//新帖排行
		if(rpn==null){
			recentpageNum=1;
		}else{
			recentpageNum = Integer.parseInt(request.getParameter("recentpageNum"));
			}
        PageUtil<Post> recentPageUtil =service.getRecentPostList(recentpageNum,pageSize);
		//将结果填充到内置对象中
        
		request.getSession().setAttribute("recentPageUtil", recentPageUtil);
		
		//用户排行
		if(usersRanking==null){
			usersRanking="shoeuser";
		}
		List<UsersRanking> usersRank= userservice.getUsersRanking();
		request.getSession().setAttribute("usersRank", usersRank);
		
		
		if(action==null){
			action="showjava";
		}
		//获取java类型帖子
		if(action.equals("showjava")){
			List<Post> str=service.getPostName(action);
			request.getSession().setAttribute("postName", str);
			
		}
		
		if(c==null){
			c="showc";
		}
		//获取c类型帖子
		if(c.equals("showc")){
		List<Post> clist=service.getPostName(c);
		request.getSession().setAttribute("clist", clist);
		}
		if(cjiajia==null){
			cjiajia="showc++";
		}
		//获取c++类型帖子
		if(cjiajia.equals("showc++")){
		List<Post> cjiajialist=service.getPostName(cjiajia);
		request.getSession().setAttribute("cjiajialist", cjiajialist);
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
