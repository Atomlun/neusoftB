package com.dao;

import java.util.List;

import com.entity.Follower;

public interface FollowerDao {

	int followUser(int uid, int bUid) throws Exception;

	List<Follower> getFollowerByUid(int uid, int fid) throws Exception;

	int unfollow(int uid, int fuid) throws Exception; 

}
