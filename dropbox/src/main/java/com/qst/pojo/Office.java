package com.qst.pojo;

public class Office {

    private String officeid ;
    private String officeMd5;

    public String getOfficeid() {
        return officeid;
    }

    public void setOfficeid(String officeid) {
        this.officeid = officeid;
    }

    public String getOfficeMd5() {
        return officeMd5;
    }

    public void setOfficeMd5(String officeMd5) {
        this.officeMd5 = officeMd5;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeid='" + officeid + '\'' +
                ", officeMd5='" + officeMd5 + '\'' +
                '}';
    }
}
