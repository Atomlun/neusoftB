package com.entity;


public class User {

    private Integer uid;

    private String username;

    private String password;
    
    
    private String ualevel;

    public String getUalevel() {
		return ualevel;
	}
	public void setUalevel(String ualevel) {
		this.ualevel = ualevel;
	}
	public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}