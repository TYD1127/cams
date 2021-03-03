package com.winsoar.cams.service;

import com.winsoar.cams.entity.Building;

import java.util.List;
import java.util.Map;

/**
 * (Building)表服务接口
 *
 * @author makejava
 * @since 2021-02-23 13:54:12
 */
public interface BuildingService {

    /**
     * 通过ID查询单条数据
     *
     * @param buildingId 主键
     * @return 实例对象
     */
    Building queryById(Long buildingId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Building> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    Building insert(Building building);

    /**
     * 修改数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    Building update(Building building);

    /**
     * 通过主键删除数据
     *
     * @param buildingId 主键
     * @return 是否成功
     */
    boolean deleteById(Long buildingId);

    List<Map<String, Object>> queryByAll();

    List<Map<String, Object>> toCkjs(String bid);
}
