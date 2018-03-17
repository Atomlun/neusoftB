package com.dao.impl;

import java.util.List;

import com.dao.CateGoryDao;
import com.entity.Postcate;

public class CateGoryDaoImpl implements CateGoryDao{

	@Override
		public List<Postcate> findAllPostcates() throws Exception {
			String sql = "select * from tb_postcate ";
			List<Postcate> list = BaseDao.query(sql,Postcate.class);
			System.out.println(list);
			return list;
		
	}

	@Override
	public List<Postcate> getPostcate(int startIndex, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from tb_postcate LIMIT ?,?";
		List<Postcate> list = BaseDao.query(sql, Postcate.class, startIndex,pageSize);
		return list;
	}
		
}
