package com.example.domain;

import java.util.Date;

public class userVo {
    private Long uid;
    private String upw;
    private String upw1;
    private String utel;
    private String ugen;
    private String uemail;
    private String uaddr1;
    private String uaddr2;
    private Date uregister;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUpw() {
        return upw;
    }

    public void setUpw(String upw) {
        this.upw = upw;
    }

    public String getUpw1() {
        return upw1;
    }

    public void setUpw1(String upw1) {
        this.upw1 = upw1;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUgen() {
        return ugen;
    }

    public void setUgen(String ugen) {
        this.ugen = ugen;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUaddr1() {
        return uaddr1;
    }

    public void setUaddr1(String uaddr1) {
        this.uaddr1 = uaddr1;
    }

    public String getUaddr2() {
        return uaddr2;
    }

    public void setUaddr2(String uaddr2) {
        this.uaddr2 = uaddr2;
    }

    public Date getUregister() {
        return uregister;
    }

    public void setUregister(Date uregister) {
        this.uregister = uregister;
    }
}
