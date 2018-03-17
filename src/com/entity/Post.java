package com.entity;

import java.sql.Timestamp;

public class Post {

    private Integer poid;

    private String potitle;

    private String pocontent;

    private Integer uid;

    private Timestamp potime;
    
    private String pocname;
    
    public String getPocname() {
		return pocname;
	}
	public void setPocname(String pocname) {
		this.pocname = pocname;
	}
	private String havepic;
    
    private Integer poclicknum;

    public Integer getPoclicknum() {
		return poclicknum;
	}
	public void setPoclicknum(Integer poclicknum) {
		this.poclicknum = poclicknum;
	}
	public String getHavepic() {
		return havepic;
	}
	public void setHavepic(String havepic) {
		this.havepic = havepic;
	}
	private Integer pocid;

    public Integer getPoid() {
        return poid;
    }
    public void setPoid(Integer poid) {
        this.poid = poid;
    }
    public String getPotitle() {
        return potitle;
    }
    public void setPotitle(String potitle) {
        this.potitle = potitle;
    }
    public String getPocontent() {
        return pocontent;
    }
    public void setPocontent(String pocontent) {
        this.pocontent = pocontent;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Timestamp getPotime() {
        return potime;
    }
    public void setPotime(Timestamp potime) {
        this.potime = potime;
    }
    public Integer getPocid() {
        return pocid;
    }
    public void setPocid(Integer pocid) {
        this.pocid = pocid;
    }

}