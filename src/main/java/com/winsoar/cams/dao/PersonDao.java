package com.winsoar.cams.dao;

import com.winsoar.cams.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 人员表(Person)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-06 16:27:25
 */
public interface PersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param personId 主键
     * @return 实例对象
     */
    Person queryById(Long personId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Person> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param person 实例对象
     * @return 对象列表
     */
    List<Person> queryAll(Person person);

    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 影响行数
     */
    int insert(Person person);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Person> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Person> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Person> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Person> entities);

    /**
     * 修改数据
     *
     * @param person 实例对象
     * @return 影响行数
     */
    int update(Person person);

    /**
     * 通过主键删除数据
     *
     * @param personId 主键
     * @return 影响行数
     */
    int deleteById(Long personId);

    Map<String, Object> checkname(String personName);

    Map<String, Object> checkmobile(String mobile);
}

