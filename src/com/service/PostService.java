package com.service;

import java.util.List;

import com.entity.Post;
import com.utils.PageUtil;

public interface PostService {
	PageUtil<Post> getRecentPostList(int pageNum,int pageSize);
	PageUtil<Post> getHotPostList(int pageNum,int pageSize);
	List<Post> getPostName(String action);
	int insertPost(String potitle,String pocontent,int i,int pocid);
	Post getFavoritePostByUid(Integer poid);
	List<Post> getPostByUid(int uid);
	Post getPostByPoid(int poid);
	int getAddPoclicknum(int poid);
	int delPostByPoid(int poid);
	List<Post> searchPostListByKeyword(String searchKeyword);
}
