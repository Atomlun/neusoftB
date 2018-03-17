package com.service;

import com.entity.Userinfo;

public interface UserinfoService {

	Userinfo getUserinfoByUid(int uid);

	int UpdateUserinfo(Userinfo uinfo);

}
