package com.entity;

import java.sql.Timestamp;

public class Follower {

    private Integer uid;

    private Integer fuid;

    private Timestamp fotime;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getFuid() {
        return fuid;
    }
    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }
    public Timestamp getFotime() {
        return fotime;
    }
    public void setFotime(Timestamp fotime) {
        this.fotime = fotime;
    }

}