package com.example.demo.controller;

import com.example.demo.mapper.StudentDao;
import com.example.demo.mapper.TeacherDao;
import com.example.demo.model.Homework;
import com.example.demo.model.Sthomework;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private StudentService studentService;


    //查询布置过的某个作业
    @RequestMapping("/queryEmp")
    public String showgetBytitle(String homeworktitle, Model model){

            Homework list = teacherService.getBytitle(homeworktitle);
            model.addAttribute("list",list);
            return "allHomework";

    }




    //展示所有布置的作业
    @RequestMapping("/allHomework")
    public String list(Model model) {
        List<Homework> list = teacherService.queryAllHomework();
        model.addAttribute("list", list);
        return "allHomework";
    }

    //跳转到添加
    @RequestMapping("toAddHomework")
    public String toAddHomework() {
        return "addHomework";
    }

    //发布新作业
    @RequestMapping("/addHomework")
    public String addHmework(Homework homework) {
        teacherService.addHomework(homework);
        return "redirect:/allHomework";
    }

    //删除
    @RequestMapping("/deleteHomework/{homeworkid}")
    public String deleteHomework(@PathVariable("homeworkid") Long id) {
        teacherService.deleteHomeworkById(id);
        return "redirect:/allHomework";
    }

    //跳转到修改
    @RequestMapping("toUpdateHomework")
    public String toUpdateHomework(Model model, Long id) {
        model.addAttribute("homework", teacherService.queryhomeworkById(id));
        return "updateHomework";
    }

    //修改
    @RequestMapping("/updateHomework")
    public String updateHomework(Model model, Homework homework) {
        teacherService.updateHomework(homework);
        homework = teacherService.queryhomeworkById(homework.getHomeworkid());
        model.addAttribute("homework", homework);
        return "redirect:/allHomework";

    }


    //展示所有学生
    @RequestMapping("/allStudent")
    public String list1(Model model) {
        List<Student> list = teacherService.queryAllStudent();
        model.addAttribute("list", list);
        return "allStudent";
    }

    //跳转到添加
    @RequestMapping("toAddStudent")
    public String toAddStudent() {
        return "addStudent";
    }

    //添加
    @RequestMapping("/addStudent")
    public String addStudent(Student student) {
        teacherService.addStudent(student);
        return "redirect:/allStudent";
    }

    //删除
    @RequestMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long id) {
        teacherService.deleteStudentById(id);
        return "redirect:/allStudent";
    }

    //跳转到修改
    @RequestMapping("toUpdateStudent")
    public String toUpdateStudent(Model model, Long id) {
        model.addAttribute("student", teacherService.queryById(id));
        return "updateStudent";
    }

    //修改
    @RequestMapping("/updateStudent")
    public String updateStudent(Model model, Student student) {
        teacherService.updateStudent(student);
        student = teacherService.queryById(student.getStudentId());
        model.addAttribute("student", student);
        return "redirect:/allStudent";

    }
    //学生作业提交情况
    @RequestMapping("/showStwork")
    public String list2(Model model) {
        List<Sthomework> list = studentService.queryAllSthomework();
        model.addAttribute("list", list);
        return "showStwork";
    }

    //跳转到查看详情
    @RequestMapping("toworkdetails")
    public String toUpdateSthomework(Model model, Long id) {
        model.addAttribute("sthomework", studentService.querySthomeworkById(id));
        return "workdetails";
    }

    //评价
    @RequestMapping("/workdetails")
    public String updateSthomework(Model model, Sthomework sthomework) {
        studentService.updateSthomework(sthomework);
        sthomework = studentService.querySthomeworkById(sthomework.getSthomeworkid());
        model.addAttribute("sthomework", sthomework);
        return "redirect:/workdetails";

    }
}

