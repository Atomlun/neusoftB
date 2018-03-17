package com.service.impl;

import java.util.List;

import com.dao.UsersDao;
import com.dao.impl.UsersDaoDaoImpl;
import com.entity.Favorite;
import com.entity.Follower;
import com.entity.User;
import com.entity.Userinfo;
import com.service.UsersService;
import com.utils.BeFollower;
import com.utils.UsersRanking;

public class UsersServiceImpl implements UsersService {
	private UsersDao dao;
	public UsersServiceImpl() {
		dao = new UsersDaoDaoImpl();
	}
	@Override
	//查询所有的用户
	public List<UsersRanking> getUsersRanking() {
		
		try {
			return	dao.getUsersRanking();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	//通过用户id获取此用户关注了谁
	public List<Follower> getBeFollowerUserIdByuid(int uid) {
		try {
			return dao.getBeFollowerUserIdByuid(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	//通过用户id获取此用户发表的帖子
	public List<Favorite> getFavoritePostByuid(int uid) {
		try {
			return dao.getFavoritePostByuid(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	//根据用户id在用户详细信息表中查到信息
	public BeFollower getUserInfoByUid(Integer uid) {
		
		BeFollower beFollower;
		try {
			beFollower=dao.getUserInfoByUid(uid);
			return beFollower;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	//根据用户id查到用户信息
	public User getUserbyUid(int uid) {
		try {
			return dao.getgetUserbyUid(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
