package com.winsoar.cams.service;

import com.winsoar.cams.entity.Schedule;
import java.util.List;
import java.util.Map;

/**
 * (Schedule)表服务接口
 *
 * @author makejava
 * @since 2021-02-06 16:27:28
 */
public interface ScheduleService {

    /**
     * 通过ID查询单条数据
     *
     * @param scheduleId 主键
     * @return 实例对象
     */
    Schedule queryById(Long scheduleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Schedule> queryAllByLimit(int offset, int limit);
    /**
     * 查询详细课表
     * @return 对象列表
     */
    List<Map<String, Object>> queryScheduleAll();

    /**
     * 新增数据
     *
     * @param schedule 实例对象
     * @return 实例对象
     */
    Schedule insert(Schedule schedule);

    /**
     * 修改数据
     *
     * @param schedule 实例对象
     * @return 实例对象
     */
    Schedule update(Schedule schedule);

    /**
     * 通过主键删除数据
     *
     * @param scheduleId 主键
     * @return 是否成功
     */
    boolean deleteById(Long scheduleId);

}
