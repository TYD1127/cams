package com.winsoar.cams.controller;

import com.winsoar.cams.entity.Person;
import com.winsoar.cams.entity.User;
import com.winsoar.cams.service.ClasstableService;
import com.winsoar.cams.service.PersonService;
import com.winsoar.cams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 人员表(Person)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:26
 */
@Controller
@RequestMapping("person")
public class PersonController {
    /**
     * 服务对象
     */
    @Resource
    private PersonService personService;
    @Resource
    private ClasstableService classtableService;
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Person selectOne(Long id) {
        return this.personService.queryById(id);
    }

    /*检查用户名是否存在*/
    @RequestMapping("/checkname")
    public void tocheckname(Person person, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.reset();
        System.out.println(person.getPersonName());
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> re = personService.checkname(person.getPersonName());
        if (re == null) {
            response.getWriter().print(true);
        } else {
            response.getWriter().print(false);
        }
    }

    /*检查用户名是否存在*/
    @RequestMapping("/mobile")
    public void tocheckmobile(Person person, HttpServletResponse response) throws IOException {
        response.reset();
        System.out.println(person.getMobile());
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> re = personService.checkmobile(person.getMobile());
        if (re == null) {
            response.getWriter().print(true);
        } else {
            response.getWriter().print(false);
        }
    }

    /*跳转添加学生页*/
    @RequestMapping("/toInsertStudent")
    public ModelAndView toInsertStudent(Long personId) {
        ModelAndView view = new ModelAndView();
        view.setViewName("h-ui/person/insertstudent");
        if (personId != null) {
            Person person = personService.queryById(personId);
            view.addObject("personinfo", person);
        } else {
            List<Map<String, Object>> classlist = classtableService.queryAllInfo();
            view.addObject("classlist", classlist);
        }
        return view;
    }

    /*添加学生信息*/
    @ResponseBody
    @RequestMapping("/insertstudent")
    public HashMap<String, Object> insertstudent(Person person) {
        String password = new BCryptPasswordEncoder().encode("123456");
        person.setPersonType(2);
        Person insert = personService.insert(person);
        User user = new User();
        user.setUsername(person.getPersonName());
        user.setPassword(password);
        user.setUsertype(person.getPersonType());
        user.setAccount(person.getMobile());
        User insert1 = userService.insert(user);
        HashMap<String, Object> map = new HashMap<>();
        if (insert != null || insert1 != null) {
            map.put("sucess", "1");
            map.put("msg", "添加成功");

        } else {
            map.put("sucess", "0");
            map.put("msg", "添加失败");
        }
        return map;
    }

}
