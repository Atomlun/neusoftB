package com.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Comment {

    private Integer cid;

    private Integer uid;

    private Integer poid;

    private String ccontent;

    private Timestamp ctime;

    public Integer getCid() {
        return cid;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getPoid() {
        return poid;
    }
    public void setPoid(Integer poid) {
        this.poid = poid;
    }
    public String getCcontent() {
        return ccontent;
    }
    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }
    public Timestamp getCtime() {
        return ctime;
    }
    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

}