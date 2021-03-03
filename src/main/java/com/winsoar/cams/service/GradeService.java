package com.winsoar.cams.service;

import com.winsoar.cams.entity.Grade;
import java.util.List;

/**
 * (Grade)表服务接口
 *
 * @author makejava
 * @since 2021-02-06 16:27:22
 */
public interface GradeService {

    /**
     * 通过ID查询单条数据
     *
     * @param gradeId 主键
     * @return 实例对象
     */
    Grade queryById(Long gradeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Grade> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    Grade insert(Grade grade);

    /**
     * 修改数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    Grade update(Grade grade);

    /**
     * 通过主键删除数据
     *
     * @param gradeId 主键
     * @return 是否成功
     */
    boolean deleteById(Long gradeId);

}
