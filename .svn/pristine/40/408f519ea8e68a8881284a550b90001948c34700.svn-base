package com.dao;

import java.sql.Date;

import com.entity.User;
import com.entity.Userinfo;

public interface UserDao {
	int addUser(User user)throws Exception;

	Userinfo login(User user) throws Exception;
	int register(String username,String password) throws Exception;
    int userInfo(int i,String uname, String sex,Date birthday, String address,String email)throws Exception;
    int getIdByUsername(String username)throws Exception;
}
