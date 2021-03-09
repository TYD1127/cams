package com.winsoar.cams.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.winsoar.cams.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author TangYaD
 * @Date 2021/2/6 11:51
 * @Version 1.0
 */
@Controller
@RequestMapping("schedule")
public class ScheduleControlle {
    @Autowired
    private ScheduleService scheduleService;
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "h-ui/schedule/index";
    }
    //App获取课表页面
    @RequestMapping("/mtoIndex")
    public String tomIndex() {
        return "h-ui/schedule/index";
    }
//    查询课表详细
    @RequestMapping("/getScheduleList")
    @ResponseBody
    public JSONArray getScheduleList() {
        List<Map<String, Object>> schedules = scheduleService.queryScheduleAll();
        String json1=JSON.toJSONString(schedules);
        JSONArray jsonObject = (JSONArray) JSON.toJSON(schedules);
        return jsonObject;
    }

}
