package com.service.impl;

import com.dao.UserinfoDao;
import com.dao.impl.UserinfoDaoImpl;
import com.entity.Userinfo;
import com.service.UserinfoService;

public class UserinfoServiceImpl implements UserinfoService {

	private UserinfoDao dao = null ;
	public UserinfoServiceImpl() {
		dao = new UserinfoDaoImpl();
	}
	
	@Override
	public Userinfo getUserinfoByUid(int uid) {
		try {
			return dao.getUserinfoByUid(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int UpdateUserinfo(Userinfo uinfo) {
		try {
			return  dao.UpdateUserinfo(uinfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
