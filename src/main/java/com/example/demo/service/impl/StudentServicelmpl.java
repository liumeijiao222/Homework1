package com.example.demo.service.impl;



import com.example.demo.mapper.StudentDao;
import com.example.demo.model.Sthomework;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 在数据库中进行的增删改查操作
 * ServiceImpl.java文件内容，实现类
 */
@Service("StudentService")
public class StudentServicelmpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int addSthomework(Sthomework sthomework) {
        return studentDao.addSthomework(sthomework);
    }

    @Override
    public int  deleteSthomeworkById(long id) {
        return studentDao.deleteSthomeworkById(id);
    }

    @Override
    public int updateSthomework(Sthomework sthomework){
        return studentDao.updateSthomework(sthomework);
    }

    @Override
    public Sthomework querySthomeworkById(long id) {
        return studentDao.querySthomeworkById(id);
    }

    @Override
    public List<Sthomework> queryAllSthomework() {
        return studentDao.queryAllSthomework();
    }



}
