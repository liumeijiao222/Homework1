package com.example.demo.service;

import com.example.demo.model.Homework;
import com.example.demo.model.Student;


import java.util.List;

public interface TeacherService {

    int addHomework(Homework homework);

    int deleteHomeworkById(long id);

    int updateHomework(Homework homework);

    Homework queryhomeworkById(long id);

    List<Homework> queryAllHomework();

    Homework getBytitle(String homeworktitle);

    int addStudent(Student student);

    int deleteStudentById(long id);

    int updateStudent(Student student);

    Student queryById(long id);

    List<Student> queryAllStudent();
}
