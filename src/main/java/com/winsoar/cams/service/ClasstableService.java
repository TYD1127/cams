package com.winsoar.cams.service;

import com.winsoar.cams.entity.Classtable;

import java.util.List;
import java.util.Map;

/**
 * 班级表(Classtable)表服务接口
 *
 * @author makejava
 * @since 2021-02-18 17:05:05
 */
public interface ClasstableService {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    Classtable queryById(Long classId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Classtable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param classtable 实例对象
     * @return 实例对象
     */
    Classtable insert(Classtable classtable);

    /**
     * 修改数据
     *
     * @param classtable 实例对象
     * @return 实例对象
     */
    Classtable update(Classtable classtable);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    boolean deleteById(Long classId);

    List<Map<String ,Object>> queryAllInfo();
}
