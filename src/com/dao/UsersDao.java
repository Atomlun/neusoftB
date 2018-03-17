package com.dao;

import java.util.List;

import com.entity.Favorite;
import com.entity.Follower;
import com.entity.User;
import com.utils.BeFollower;
import com.utils.UsersRanking;

public interface UsersDao {
	 List<UsersRanking> getUsersRanking() throws Exception;
	 List<Follower> getBeFollowerUserIdByuid(int uid)throws Exception;
	 List<Favorite> getFavoritePostByuid(int uid)throws Exception;
	 BeFollower getUserInfoByUid(Integer uid)throws Exception;
	User getgetUserbyUid(int uid)throws Exception;
}
