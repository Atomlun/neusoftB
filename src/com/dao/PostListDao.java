package com.dao;

import java.util.List;

import com.entity.Post;


public interface PostListDao {

	List<Post> findPostByPocid(Integer pocid) throws Exception;
	List<Post> getPostcate(int startIndex,int pageSize) throws Exception;
}
