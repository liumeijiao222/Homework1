package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class Sthomework {

    private long sthomeworkid;
    private String homeworktitle;
    private String name;
    private String sthomeworkcontent;
    private Date stworkcreatetime;

    public long getSthomeworkid() {
        return sthomeworkid;
    }

    public void setSthomeworkid(long sthomeworkid) {
        this.sthomeworkid = sthomeworkid;
    }

    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSthomeworkcontent() {
        return sthomeworkcontent;
    }

    public void setSthomeworkcontent(String sthomeworkcontent) {
        this.sthomeworkcontent = sthomeworkcontent;
    }

    public Date getStworkcreatetime() {
        return stworkcreatetime;
    }

    public void setStworkcreatetime(Date stworkcreatetime) {
        this.stworkcreatetime = stworkcreatetime;
    }
}
