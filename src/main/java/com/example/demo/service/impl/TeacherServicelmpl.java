package com.example.demo.service.impl;


import com.example.demo.mapper.TeacherDao;
import com.example.demo.model.Homework;


import com.example.demo.model.Student;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeacherService")
public class TeacherServicelmpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public int addHomework(Homework homework) {
        return teacherDao.addHomework(homework);
    }

    @Override
    public int deleteHomeworkById(long id) {
        return teacherDao.deleteHomeworkById(id);
    }

    @Override
    public int updateHomework(Homework homework)
    {
        return teacherDao.updateHomework(homework);
    }

    @Override
    public Homework queryhomeworkById(long id) {
        return teacherDao.queryhomeworkById(id);
    }

    @Override
    public List<Homework> queryAllHomework() {
        return teacherDao.queryAllHomework();
    }

    @Override
    public Homework getBytitle(String homeworktitle) {
        return teacherDao.getBytitle(homeworktitle);
    }

    @Override
    public int addStudent(Student student) {
        return teacherDao.addStudent(student);
    }

    @Override
    public int deleteStudentById(long id) {
        return teacherDao.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return teacherDao.updateStudent(student);
    }

    @Override
    public Student queryById(long id) {
        return teacherDao.queryById(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return teacherDao.queryAllStudent();
    }

}

