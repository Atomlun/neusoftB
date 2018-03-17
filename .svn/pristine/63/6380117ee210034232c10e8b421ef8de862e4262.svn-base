package com.service.impl;

import java.util.List;

import com.dao.FollowerDao;
import com.dao.impl.FollowerDaoImpl;
import com.entity.Follower;
import com.entity.Post;
import com.service.FollowerService;

public class FollowerServiceImpl implements FollowerService {

	private FollowerDao dao = null;
	
	public FollowerServiceImpl() {
		dao = new FollowerDaoImpl();
	}
	@Override
	public int followUser(int uid, int bUid) {
		try {
			return dao.followUser(uid,bUid);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Follower> getFollowerByUid(int uid,int fid) {
		try {
			return dao.getFollowerByUid(uid,fid);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int unfollow(int uid, int fuid) {
		try {
			return dao.unfollow(uid,fuid);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}

}
