package com.winsoar.cams.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.winsoar.cams.entity.Building;
import com.winsoar.cams.service.BuildingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Building)表控制层
 *
 * @author makejava
 * @since 2021-02-23 13:54:13
 */
@Controller
@RequestMapping("building")
public class BuildingController {
    /**
     * 服务对象
     */
    @Resource
    private BuildingService buildingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Building selectOne(Long id) {
        return this.buildingService.queryById(id);
    }

    /*跳转教室管理页*/
    @RequestMapping("/toJsgl")
    public String toJsgl() {
        return "h-ui/building/index";
    }

    /*    获取教学楼信息*/
    @RequestMapping("/getInfo")
    @ResponseBody
    public JSONArray getInfo() {
        List<Map<String, Object>> maps = buildingService.queryByAll();
        JSONArray jsonObject = (JSONArray) JSON.toJSON(maps);
        return jsonObject;
    }

    @RequestMapping("/toCkjs")
    public String toCkjs(String Bid, Model model) {
        List<Map<String, Object>> classroomlist = buildingService.toCkjs(Bid);
        model.addAttribute("jsinfo", classroomlist);
        return "h-ui/building/editer";
    }

    @RequestMapping("/mgetjs")
    @ResponseBody
    public JSONArray mgetjs(String Bid, Model model) {
        List<Map<String, Object>> classroomlist = buildingService.toCkjs(Bid);
        JSONArray jsonObject = (JSONArray) JSON.toJSON(classroomlist);
        return jsonObject;
    }

    @RequestMapping("/mgetjsinfo")
    @ResponseBody
    public JSONArray mgetjsInfo() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        List<Map<String, Object>> maps = buildingService.queryByAll();
        for (Map<String, Object> map : maps) {
            HashMap<String, Object> m = new HashMap<>();
            List<Map<String, Object>> jsInfo = buildingService.toCkjs(map.get("Bid").toString());
            m.put("croominfo", jsInfo);
            m.put("Bname",map.get("Bname").toString());
            System.out.println(map.toString());
            m.put("Bid",map.get("Bid").toString());
            list.add(m);
        }
        JSONArray jsonObject = (JSONArray) JSON.toJSON(list);
        return jsonObject;
    }

    @RequestMapping("/totjjs")
    public String totjjs(String Bid, Model model) {
        model.addAttribute("jxlid", Bid);
        return "h-ui/building/insert";
    }

}
