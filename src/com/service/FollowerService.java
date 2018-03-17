package com.service;

import java.util.List;

import com.entity.Follower;

public interface FollowerService {

	int followUser(int uid, int bUid);

	List<Follower> getFollowerByUid(int uid,int fid);

	int unfollow(int uid, int fuid);

}
