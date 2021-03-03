package com.winsoar.cams.controller;

import com.winsoar.cams.entity.DetailedSchedule;
import com.winsoar.cams.service.DetailedScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DetailedSchedule)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:20
 */
@RestController
@RequestMapping("detailedSchedule")
public class DetailedScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private DetailedScheduleService detailedScheduleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DetailedSchedule selectOne(Long id) {
        return this.detailedScheduleService.queryById(id);
    }

}
