package com.dao.impl;

import com.dao.UserinfoDao;
import com.entity.Userinfo;

public class UserinfoDaoImpl implements UserinfoDao {

	@Override
	public Userinfo getUserinfoByUid(int uid) throws Exception {
		String sql = "select * from tb_userinfo where uid = ? ";
		return BaseDao.query(sql, Userinfo.class, uid).get(0);
	}

	@Override
	public int UpdateUserinfo(Userinfo uinfo) throws Exception {
		String sql = "update tb_userinfo set uname=?,sex=?,address=?,email=?,birthday=? where uid = ? ";
		return BaseDao.update(sql, uinfo.getUname(),uinfo.getSex(),uinfo.getAddress(),uinfo.getEmail(),uinfo.getBirthday(),uinfo.getUid());
	}

}
