package com.winsoar.cams.uicontroller;

import com.winsoar.cams.dao.PersonMapper;
import com.winsoar.cams.pojo.Person;
import com.winsoar.cams.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
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

    @RequestMapping({"/toLogin", "/"})
    public String toLogin() {
        return "h-ui/login";
    }

    @RequestMapping("/success")
    public String toIndex(Model model, HttpServletRequest request) {
        String token = "";
        Cookie[] cookies = request.getCookies();
        for (Cookie a : cookies) {
            if (a.getName().equals("Authorization")) {
                token = URLDecoder.decode(a.getValue());
                break;
            }
        }
        String userName = JwtUtil.validateToken(token);
        model.addAttribute("userName", userName);
        System.out.println(userName);
        return "h-ui/index";
    }

    @RequestMapping("/welcome")
    public String toWelcome() {
        return "h-ui/welcome";
    }

    @RequestMapping("/toCET")
    public String toCET() {
        return "h-ui/CET/index";
    }

    @RequestMapping("/PersonnelInfo")
    public String toPersonnelInfo(Model model) {
        List<Person> TeacherList = personMapper.selectTeacherPerson();
        List<Person> StudentList = personMapper.selectStudentPerson();
        model.addAttribute("TeacherList", TeacherList);
        model.addAttribute("StudentList", StudentList);
        System.out.println(StudentList);
        return "h-ui/PersonnelInfo";
    }

}
