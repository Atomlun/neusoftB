package com.service;

import java.sql.Date;
import java.sql.Timestamp;

import com.entity.User;
import com.entity.Userinfo;

public interface UserService {
	 int register(String username,String password);
	 Userinfo login(User user);
	 int userInfo(String username,String uname, String sex,Date birthday, String address,String email);
}
