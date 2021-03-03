package com.winsoar.cams.service;

import com.winsoar.cams.entity.Result;

import java.util.List;
import java.util.Map;

/**
 * (Result)表服务接口
 *
 * @author makejava
 * @since 2021-02-20 11:58:39
 */
public interface ResultService {

    /**
     * 通过ID查询单条数据
     *
     * @param resultId 主键
     * @return 实例对象
     */
    Result queryById(Long resultId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Result> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    Result insert(Result result);

    /**
     * 修改数据
     *
     * @param result 实例对象
     * @return 实例对象
     */
    Result update(Result result);

    /**
     * 通过主键删除数据
     *
     * @param resultId 主键
     * @return 是否成功
     */
    boolean deleteById(Long resultId);

    List<Map<String,Object>> queryBypersonId(Long personId);
}
