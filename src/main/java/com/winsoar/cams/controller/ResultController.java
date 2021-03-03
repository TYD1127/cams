package com.winsoar.cams.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.winsoar.cams.dao.PersonMapper;
import com.winsoar.cams.entity.Result;
import com.winsoar.cams.pojo.Person;
import com.winsoar.cams.service.ResultService;
import com.winsoar.cams.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Result)表控制层
 *
 * @author makejava
 * @since 2021-02-20 11:58:40
 */
@Controller
@RequestMapping("result")
public class ResultController {
    /**
     * 服务对象
     */
    @Resource
    private ResultService resultService;
    @Autowired
    private PersonMapper personMapper;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public Result selectOne(Long id) {
        return this.resultService.queryById(id);
    }

    @RequestMapping("/toZycj")
    public String toIndex() {
        return "h-ui/TestsRequired/index";
    }

    /*    获取学生信息*/
    @RequestMapping("/getTable")
    @ResponseBody
    public JSONArray getScheduleList() {
        List<Person> StudentList = personMapper.selectStudentPerson();
        JSONArray jsonObject = (JSONArray) JSON.toJSON(StudentList);
        System.out.println("jsonObject" + jsonObject);
        return jsonObject;
    }
    @RequestMapping("/getResul")
    public ModelAndView getResul(Long personId) {
        ModelAndView view = new ModelAndView();
        List<Map<String,Object>> result = resultService.queryBypersonId(personId);
        System.out.println(result);
        if (result.size()==0){
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("courseName","无数据");
            hashMap.put("Score","无数据");
            hashMap.put("sftg","无数据");
            hashMap.put("YEAR","无数据");
            result.add(hashMap);
        }
        view.addObject("result",result);
        System.out.println(result);
        view.setViewName("h-ui/TestsRequired/editer");
        return view;
    }
}
