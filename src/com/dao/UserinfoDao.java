package com.dao;

import com.entity.Userinfo;

public interface UserinfoDao {

	Userinfo getUserinfoByUid(int uid) throws Exception;

	int UpdateUserinfo(Userinfo uinfo) throws Exception;

}
