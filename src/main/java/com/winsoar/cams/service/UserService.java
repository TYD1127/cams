package com.winsoar.cams.service;

import com.winsoar.cams.entity.User;

import java.util.List;

/**
 * 管理员表(User)表服务接口
 *
 * @author makejava
 * @since 2021-02-28 16:40:44
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    User queryById(String account);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    boolean deleteById(String account);

}
