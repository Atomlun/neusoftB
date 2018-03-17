package com.service;

import java.util.List;

import com.entity.Favorite;
import com.entity.Follower;
import com.entity.User;
import com.utils.BeFollower;
import com.utils.UsersRanking;

public interface UsersService {
   List<UsersRanking> getUsersRanking();

   List<Follower> getBeFollowerUserIdByuid(int uid);

   List<Favorite> getFavoritePostByuid(int uid);

   BeFollower getUserInfoByUid(Integer uid);

   User getUserbyUid(int uid);
   
}
