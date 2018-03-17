package com.dao.impl;

import java.util.List;

import com.dao.FollowerDao;
import com.entity.Follower;

public class FollowerDaoImpl implements FollowerDao {

	@Override
	public int followUser(int uid, int bUid) throws Exception {
		String sql = "insert into tb_follower(fuid,uid) values(?,?)";
		return BaseDao.update(sql, uid,bUid);
	}

	@Override
	public List<Follower> getFollowerByUid(int uid,int fid) throws Exception {
		String sql = "select * from tb_follower where uid=? and fuid=?";
		return BaseDao.query(sql, Follower.class ,uid,fid);
	}

	@Override
	public int unfollow(int uid, int fuid) throws Exception {
		String sql = "delete from tb_follower where uid =? and fuid =?";
		return BaseDao.update(sql, uid,fuid);
	}

}
