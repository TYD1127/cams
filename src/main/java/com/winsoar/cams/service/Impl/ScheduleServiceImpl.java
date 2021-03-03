package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Schedule;
import com.winsoar.cams.dao.ScheduleDao;
import com.winsoar.cams.service.ScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Schedule)表服务实现类
 *
 * @author makejava
 * @since 2021-02-06 16:27:28
 */
@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    private ScheduleDao scheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scheduleId 主键
     * @return 实例对象
     */
    @Override
    public Schedule queryById(Long scheduleId) {
        return this.scheduleDao.queryById(scheduleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Schedule> queryAllByLimit(int offset, int limit) {
        return this.scheduleDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Map<String, Object>> queryScheduleAll() {
        return scheduleDao.queryScheduleAll();
    }

    /**
     * 新增数据
     *
     * @param schedule 实例对象
     * @return 实例对象
     */
    @Override
    public Schedule insert(Schedule schedule) {
        this.scheduleDao.insert(schedule);
        return schedule;
    }

    /**
     * 修改数据
     *
     * @param schedule 实例对象
     * @return 实例对象
     */
    @Override
    public Schedule update(Schedule schedule) {
        this.scheduleDao.update(schedule);
        return this.queryById(schedule.getScheduleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param scheduleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long scheduleId) {
        return this.scheduleDao.deleteById(scheduleId) > 0;
    }
}
