package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class Homework {
    private long homeworkid;
    private String homeworktitle;
    private String homeworkcontent;
    private Date homeworkcreate_time;
    private String homeworkupdate_time;

    public long getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(long homeworkid) {
        this.homeworkid = homeworkid;
    }

    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle;
    }

    public String getHomeworkcontent() {
        return homeworkcontent;
    }

    public void setHomeworkcontent(String homeworkcontent) {
        this.homeworkcontent = homeworkcontent;
    }

    public Date getHomeworkcreate_time() {
        return homeworkcreate_time;
    }

    public void setHomeworkcreate_time(Date homeworkcreate_time) {
        this.homeworkcreate_time = homeworkcreate_time;
    }

    public String getHomeworkupdate_time() {
        return homeworkupdate_time;
    }

    public void setHomeworkupdate_time(String homeworkupdate_time) {
        this.homeworkupdate_time = homeworkupdate_time;
    }
}
