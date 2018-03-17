package com.dao.impl;

import com.dao.PostcateDao;
import com.entity.Postcate;

public class PostcateDaoImpl implements PostcateDao {

	@Override
	public Postcate getPostcateByPocid(int pocid) throws Exception {
		String sql = "select * from tb_postcate where pocid = ?";
		
		return BaseDao.query(sql, Postcate.class, pocid).get(0);
	}

}
