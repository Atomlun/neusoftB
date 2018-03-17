package com.service.impl;

import com.dao.showContentDao;
import com.dao.impl.collectDaoimpl;
import com.dao.impl.showContentDaoimpl;
import com.entity.Favorite;
import com.entity.Post;
import com.service.showContentService;

public class showContentImpl implements showContentService{
   private showContentDao dao;
   public showContentImpl(){
	  dao = new showContentDaoimpl();
   }
   
	@Override
	public Post getPostById(int poid) {
		try {
			Post pos= dao.getPostById(poid);
			return pos;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(int uid, int poid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
