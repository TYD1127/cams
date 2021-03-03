package com.winsoar.cams.dao;

import com.winsoar.cams.entity.Classroom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Classroom)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-06 16:27:12
 */
public interface ClassroomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classRoomId 主键
     * @return 实例对象
     */
    Classroom queryById(Long classRoomId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Classroom> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param classroom 实例对象
     * @return 对象列表
     */
    List<Classroom> queryAll(Classroom classroom);

    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int insert(Classroom classroom);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classroom> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classroom> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classroom> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Classroom> entities);

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int update(Classroom classroom);

    /**
     * 通过主键删除数据
     *
     * @param classRoomId 主键
     * @return 影响行数
     */
    int deleteById(Long classRoomId);

}

