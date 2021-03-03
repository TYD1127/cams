package com.winsoar.cams.dao;

import com.winsoar.cams.entity.Schedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (Schedule)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-06 16:27:28
 */
public interface ScheduleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param scheduleId 主键
     * @return 实例对象
     */
    Schedule queryById(Long scheduleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Schedule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param schedule 实例对象
     * @return 对象列表
     */
    List<Schedule> queryAll(Schedule schedule);

    /**
     * 新增数据
     *
     * @param schedule 实例对象
     * @return 影响行数
     */
    int insert(Schedule schedule);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Schedule> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Schedule> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Schedule> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Schedule> entities);

    /**
     * 修改数据
     *
     * @param schedule 实例对象
     * @return 影响行数
     */
    int update(Schedule schedule);

    /**
     * 通过主键删除数据
     *
     * @param scheduleId 主键
     * @return 影响行数
     */
    int deleteById(Long scheduleId);

    List<Map<String,Object>> queryScheduleAll();
}

