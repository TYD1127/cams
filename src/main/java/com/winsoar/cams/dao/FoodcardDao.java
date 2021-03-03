package com.winsoar.cams.dao;

import com.winsoar.cams.entity.Foodcard;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (Foodcard)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-22 16:46:40
 */
public interface FoodcardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param foodcardId 主键
     * @return 实例对象
     */
    Foodcard queryById(Long foodcardId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Foodcard> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param foodcard 实例对象
     * @return 对象列表
     */
    List<Foodcard> queryAll(Foodcard foodcard);

    /**
     * 新增数据
     *
     * @param foodcard 实例对象
     * @return 影响行数
     */
    int insert(Foodcard foodcard);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Foodcard> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Foodcard> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Foodcard> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Foodcard> entities);

    /**
     * 修改数据
     *
     * @param foodcard 实例对象
     * @return 影响行数
     */
    int update(Foodcard foodcard);

    /**
     * 通过主键删除数据
     *
     * @param foodcardId 主键
     * @return 影响行数
     */
    int deleteById(Long foodcardId);

    List<Map<String, Object>> getInfo();
}

