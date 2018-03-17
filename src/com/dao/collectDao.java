package com.dao;

import com.entity.Favorite;

public interface collectDao {
	Favorite getFavoriteById(int poid) throws Exception;
	int insert(int uid,int poid) throws Exception;
	}
