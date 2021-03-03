package com.winsoar.cams.controller;

import com.winsoar.cams.entity.User;
import com.winsoar.cams.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员表(User)表控制层
 *
 * @author makejava
 * @since 2021-02-28 16:40:45
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(String id) {
        return this.userService.queryById(id);
    }

}
