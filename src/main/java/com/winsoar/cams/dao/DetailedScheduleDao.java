package com.winsoar.cams.dao;

import com.winsoar.cams.entity.DetailedSchedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DetailedSchedule)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-06 16:27:18
 */
public interface DetailedScheduleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param detailedScheduleId 主键
     * @return 实例对象
     */
    DetailedSchedule queryById(Long detailedScheduleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DetailedSchedule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param detailedSchedule 实例对象
     * @return 对象列表
     */
    List<DetailedSchedule> queryAll(DetailedSchedule detailedSchedule);

    /**
     * 新增数据
     *
     * @param detailedSchedule 实例对象
     * @return 影响行数
     */
    int insert(DetailedSchedule detailedSchedule);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DetailedSchedule> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DetailedSchedule> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DetailedSchedule> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DetailedSchedule> entities);

    /**
     * 修改数据
     *
     * @param detailedSchedule 实例对象
     * @return 影响行数
     */
    int update(DetailedSchedule detailedSchedule);

    /**
     * 通过主键删除数据
     *
     * @param detailedScheduleId 主键
     * @return 影响行数
     */
    int deleteById(Long detailedScheduleId);

}

