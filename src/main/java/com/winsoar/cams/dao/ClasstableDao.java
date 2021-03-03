package com.winsoar.cams.dao;

import com.winsoar.cams.entity.Classtable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 班级表(Classtable)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-18 17:05:04
 */
@Repository
@Mapper
public interface ClasstableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    Classtable queryById(Long classId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Classtable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param classtable 实例对象
     * @return 对象列表
     */
    List<Classtable> queryAll(Classtable classtable);

    List<Map<String,Object>> queryAllInfo();

    /**
     * 新增数据
     *
     * @param classtable 实例对象
     * @return 影响行数
     */
    int insert(Classtable classtable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classtable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classtable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classtable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Classtable> entities);

    /**
     * 修改数据
     *
     * @param classtable 实例对象
     * @return 影响行数
     */
    int update(Classtable classtable);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 影响行数
     */
    int deleteById(Long classId);

}

