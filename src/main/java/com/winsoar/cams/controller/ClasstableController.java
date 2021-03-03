package com.winsoar.cams.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.winsoar.cams.entity.Classtable;
import com.winsoar.cams.service.ClasstableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 班级表(Classtable)表控制层
 *
 * @author makejava
 * @since 2021-02-18 17:05:06
 */
@Controller
public class ClasstableController {
    /**
     * 服务对象
     */
    @Resource
    private ClasstableService classtableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public Classtable selectOne(Long id) {
        return this.classtableService.queryById(id);
    }

    /*跳转班级信息主页*/
    @RequestMapping("/ClassInfo")
    public String toIndex(Model model) {
        List<Map<String, Object>> maps = classtableService.queryAllInfo();
        model.addAttribute("tableInfo",maps);
        System.out.println(maps);
        return "h-ui/ClassInfo/index";
    }
    /*    获取班级信息*/
    @RequestMapping("/getTable")
    @ResponseBody
    public JSONArray getScheduleList() {
        List<Map<String, Object>> maps = classtableService.queryAllInfo();
        JSONArray jsonObject = (JSONArray) JSON.toJSON(maps);
        System.out.println("jsonObject"+jsonObject);
        return jsonObject;
    }
}
