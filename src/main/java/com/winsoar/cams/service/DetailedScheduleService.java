package com.winsoar.cams.service;

import com.winsoar.cams.entity.DetailedSchedule;
import java.util.List;

/**
 * (DetailedSchedule)表服务接口
 *
 * @author makejava
 * @since 2021-02-06 16:27:18
 */
public interface DetailedScheduleService {

    /**
     * 通过ID查询单条数据
     *
     * @param detailedScheduleId 主键
     * @return 实例对象
     */
    DetailedSchedule queryById(Long detailedScheduleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DetailedSchedule> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param detailedSchedule 实例对象
     * @return 实例对象
     */
    DetailedSchedule insert(DetailedSchedule detailedSchedule);

    /**
     * 修改数据
     *
     * @param detailedSchedule 实例对象
     * @return 实例对象
     */
    DetailedSchedule update(DetailedSchedule detailedSchedule);

    /**
     * 通过主键删除数据
     *
     * @param detailedScheduleId 主键
     * @return 是否成功
     */
    boolean deleteById(Long detailedScheduleId);

}
