package com.winsoar.cams.controller;

import com.winsoar.cams.entity.Course;
import com.winsoar.cams.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:17
 */
@RestController
@RequestMapping("course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Course selectOne(Long id) {
        return this.courseService.queryById(id);
    }

}
