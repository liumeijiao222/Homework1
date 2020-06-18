package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * 第一步：创建实体层
 */
@Repository

public class Student {

    private long studentId;
    private String studentname;
    private Date studentcreateTime;
    private Date studentupdateTime;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Date getStudentcreateTime() {
        return studentcreateTime;
    }

    public void setStudentcreateTime(Date studentcreateTime) {
        this.studentcreateTime = studentcreateTime;
    }

    public Date getStudentupdateTime() {
        return studentupdateTime;
    }

    public void setStudentupdateTime(Date studentupdateTime) {
        this.studentupdateTime = studentupdateTime;
    }
}
