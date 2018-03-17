package com.entity;

import java.sql.Timestamp;

public class Favorite {

    private Integer uid;

    private Integer poid;

    private Timestamp fatime;

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
    public Timestamp getFatime() {
        return fatime;
    }
    public void setFatime(Timestamp fatime) {
        this.fatime = fatime;
    }

}