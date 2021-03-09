package com.winsoar.cams.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.winsoar.cams.entity.Foodcard;
import com.winsoar.cams.pojo.Person;
import com.winsoar.cams.service.FoodcardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Foodcard)表控制层
 *
 * @author makejava
 * @since 2021-02-22 16:46:41
 */
@Controller
@RequestMapping("foodcard")
public class FoodcardController {
    /**
     * 服务对象
     */
    @Resource
    private FoodcardService foodcardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Foodcard selectOne(Long id) {

        return this.foodcardService.queryById(id);
    }

    @RequestMapping("/toFoodCard")
    public String toFoodCard() {
        return "h-ui/FoodCard/index";
    }

    /*    获取饭卡信息*/
    @RequestMapping("/getInfo")
    @ResponseBody
    public JSONArray getInfo() {
        List<Map<String, Object>> cardInfo = foodcardService.getInfo();
        JSONArray jsonObject = (JSONArray) JSON.toJSON(cardInfo);
        return jsonObject;
    }

    /*    获取饭卡信息*/
    @RequestMapping("/mgetFKInfo")
    @ResponseBody
    public JSONArray mgetInfo() {
        List<Map<String, Object>> cardInfo = foodcardService.getInfo();
        JSONArray jsonObject = (JSONArray) JSON.toJSON(cardInfo);
        return jsonObject;
    }

}
