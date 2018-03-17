package com.service.impl;

import com.dao.collectDao;
import com.dao.impl.collectDaoimpl;
import com.entity.Favorite;
import com.service.collectservice;

public class collectserviceimpl  implements collectservice{
           private collectDao dao;
           public collectserviceimpl(){
        	   dao = new collectDaoimpl();
           }
	@Override
	public Favorite getFavoriteById(int poid) {
		
		try {
			Favorite fav= dao.getFavoriteById(poid);
			return fav;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int insert(int uid, int poid) {
		try {
			return  dao.insert(uid,poid);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
		
	}
  
}
