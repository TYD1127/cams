package com.winsoar.cams.controller;

import com.winsoar.cams.entity.Classroom;
import com.winsoar.cams.service.ClassroomService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Classroom)表控制层
 *
 * @author makejava
 * @since 2021-02-06 16:27:13
 */
@RestController
@RequestMapping("classroom")
public class ClassroomController {
    /**
     * 服务对象
     */
    @Resource
    private ClassroomService classroomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Classroom selectOne(Long id) {

        return this.classroomService.queryById(id);
    }

}
