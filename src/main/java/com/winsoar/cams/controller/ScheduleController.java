package com.winsoar.cams.controller;

import com.winsoar.cams.entity.Schedule;
import com.winsoar.cams.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Schedule)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:29
 */
@RestController
@RequestMapping("schedule")
public class ScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private ScheduleService scheduleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Schedule selectOne(Long id) {
        return this.scheduleService.queryById(id);
    }

}
