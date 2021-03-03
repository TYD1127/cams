package com.winsoar.cams.controller;

import com.winsoar.cams.entity.Grade;
import com.winsoar.cams.service.GradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Grade)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:23
 */
@RestController
@RequestMapping("grade")
public class GradeController {
    /**
     * 服务对象
     */
    @Resource
    private GradeService gradeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Grade selectOne(Long id) {
        return this.gradeService.queryById(id);
    }

}
