package com.winsoar.cams.uicontroller;

import com.winsoar.cams.dao.PersonMapper;
import com.winsoar.cams.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author TangYaD
 * @Date 2021/1/7 13:11
 * @Version 1.0
 */
@Controller
public class UiController {
    @Autowired
    private PersonMapper personMapper;
    @RequestMapping({"/toLogin","/"})
    public String toLogin(){
        return "h-ui/login";
    }

    @RequestMapping("/success")
    public String toIndex(){
        return "h-ui/index";
    }

    @RequestMapping("/welcome")
    public String toWelcome(){
        return "h-ui/welcome";
    }

    @RequestMapping("/PersonnelInfo")
    public String toPersonnelInfo(Model model){
        List<Person> TeacherList=personMapper.selectTeacherPerson();
        List<Person> StudentList=personMapper.selectStudentPerson();
        model.addAttribute("TeacherList",TeacherList);
        model.addAttribute("StudentList",StudentList);
        System.out.println(StudentList);
        return "h-ui/PersonnelInfo";
    }

}
