package com.service.impl;

import com.dao.PostcateDao;
import com.dao.impl.PostcateDaoImpl;
import com.entity.Postcate;
import com.service.PostcateService;

public class PostcateServiceImpl implements PostcateService {

	private PostcateDao dao = null ;
	
	public PostcateServiceImpl() {
		dao = new PostcateDaoImpl();
	}
	@Override
	public Postcate getPostcateByPocid(int pocid) {
		try {
			return dao.getPostcateByPocid(pocid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
