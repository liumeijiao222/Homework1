package com.example.demo.controller;



import com.example.demo.mapper.StudentDao;
import com.example.demo.model.Homework;
import com.example.demo.model.Sthomework;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 这是控制层，前端访问的地址
 */

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;


    //展示所有学生提交的作业
    @RequestMapping("/allStwork")
    public String list1(Model model) {
        List<Sthomework> list = studentService.queryAllSthomework();
        model.addAttribute("list", list);
        return "allStwork";
    }

    //跳转到提交作业
    @RequestMapping("toAddSthomework")
    public String toAddSthomework() {
        return "addSthomework";
    }

    //提交作业
    @RequestMapping("/addSthomework")
    public String addSthomework(Sthomework sthomework) {
        studentService.addSthomework(sthomework);
        return "redirect:/allStwork";
    }

    //删除
    @RequestMapping("/deleteSthomework/{studentId}")
    public String deleteSthomework(@PathVariable("sthomeworkid") Long id) {
        studentService.deleteSthomeworkById(id);
        return "redirect:/allStwork";
    }

    //跳转到修改
    @RequestMapping("toUpdateSthomework")
    public String toUpdateSthomework(Model model, Long id) {
        model.addAttribute("sthomework", studentService.querySthomeworkById(id));
        return "updateStwork";
    }

    //修改已提交作业
    @RequestMapping("/updateStwork")
    public String updateSthomework(Model model, Sthomework sthomework) {
        studentService.updateSthomework(sthomework);
        sthomework = studentService.querySthomeworkById(sthomework.getSthomeworkid());
        model.addAttribute("sthomework", sthomework);
        return "redirect:/allStwork";

    }

    //展示所有老师布置的作业
    @RequestMapping("/allSthome")
    public String list2(Model model) {
        List<Homework> list = teacherService.queryAllHomework();
        model.addAttribute("list", list);
        return "allSthome";
    }


    //查询某个作业的信息
    @RequestMapping("/queryEmp1")
    public String showgetBytitle1(String homeworktitle, Model model){

        Homework list = teacherService.getBytitle(homeworktitle);
        model.addAttribute("list",list);
        return "allHome";

    }
}




