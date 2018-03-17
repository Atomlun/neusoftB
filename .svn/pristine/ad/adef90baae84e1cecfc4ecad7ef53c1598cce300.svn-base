package com.dao.impl;


import java.util.List;

import com.dao.collectDao;
import com.entity.Favorite;


public class collectDaoimpl implements collectDao{

	@Override
	public Favorite getFavoriteById(int poid) throws Exception {
	
		String sql = "select * from tb_favorite where poid=?";
		List<Favorite> list = BaseDao.query(sql,Favorite.class, poid);
		return list.get(0);
	}

	@Override
	public int insert(int uid, int poid) throws Exception {
	String sql ="insert into tb_favorite(uid,poid)values(?,?)";
	int fav1 = BaseDao.update(sql,uid,poid);
		return fav1;
	}
}

