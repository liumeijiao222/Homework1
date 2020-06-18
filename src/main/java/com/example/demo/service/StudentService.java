package com.example.demo.service;



import com.example.demo.model.Sthomework;
import com.example.demo.model.Student;

import java.util.List;

/**
 * 创建增删改查操作接口
 * Service.java文件内容，对数据库的操作方法接口
 */

public interface StudentService {

    int addSthomework(Sthomework sthomework);

    int deleteSthomeworkById(long id);

    int updateSthomework(Sthomework sthomework);

    Sthomework querySthomeworkById(long id);

    List<Sthomework> queryAllSthomework();


}
