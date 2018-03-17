package com.dao;

import com.entity.Post;

public interface showContentDao {
	Post getPostById(int poid) throws Exception;
	int insert(int uid,int poid) throws Exception;
}
