package com.winsoar.cams.service;

import com.winsoar.cams.entity.Foodcard;

import java.util.List;
import java.util.Map;

/**
 * (Foodcard)表服务接口
 *
 * @author makejava
 * @since 2021-02-22 16:46:40
 */
public interface FoodcardService {

    /**
     * 通过ID查询单条数据
     *
     * @param foodcardId 主键
     * @return 实例对象
     */
    Foodcard queryById(Long foodcardId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Foodcard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param foodcard 实例对象
     * @return 实例对象
     */
    Foodcard insert(Foodcard foodcard);

    /**
     * 修改数据
     *
     * @param foodcard 实例对象
     * @return 实例对象
     */
    Foodcard update(Foodcard foodcard);

    /**
     * 通过主键删除数据
     *
     * @param foodcardId 主键
     * @return 是否成功
     */
    boolean deleteById(Long foodcardId);

    List<Map<String, Object>> getInfo();

    Integer setztai(String zt, String cardNum);
}
