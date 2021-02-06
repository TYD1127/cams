package com.winsoar.cams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author TangYaD
 * @Date 2021/2/6 11:51
 * @Version 1.0
 */
@Controller
@RequestMapping("schedule")
public class ScheduleControlle {
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "h-ui/schedule/index";
    }
    @RequestMapping("/getScheduleList")
    @ResponseBody
    public String getScheduleList() {

        return "h-ui/schedule/index";
    }

}
