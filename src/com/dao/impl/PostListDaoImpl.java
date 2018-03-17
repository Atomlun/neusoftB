package com.dao.impl;

import java.util.List;

import com.dao.PostListDao;
import com.entity.Post;
import com.entity.Postcate;

public class PostListDaoImpl implements PostListDao {

	@Override
	public List<Post> findPostByPocid(Integer pocid) throws Exception {
		String sql = "select * from tb_post where pocid = ?";
		List<Post> list = BaseDao.query(sql,Post.class,pocid);
		System.out.println(list);
		return list;
	}
	@Override
	public List<Post> getPostcate(int startIndex, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from tb_post LIMIT ?,?";
		List<Post> list = BaseDao.query(sql, Post.class, startIndex,pageSize);
		return list;
	}
}
