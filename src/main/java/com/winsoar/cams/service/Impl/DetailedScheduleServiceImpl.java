package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.DetailedSchedule;
import com.winsoar.cams.dao.DetailedScheduleDao;
import com.winsoar.cams.service.DetailedScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DetailedSchedule)表服务实现类
 *
 * @author makejava
 * @since 2021-02-06 16:27:19
 */
@Service("detailedScheduleService")
public class DetailedScheduleServiceImpl implements DetailedScheduleService {
    @Resource
    private DetailedScheduleDao detailedScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param detailedScheduleId 主键
     * @return 实例对象
     */
    @Override
    public DetailedSchedule queryById(Long detailedScheduleId) {
        return this.detailedScheduleDao.queryById(detailedScheduleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DetailedSchedule> queryAllByLimit(int offset, int limit) {
        return this.detailedScheduleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param detailedSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public DetailedSchedule insert(DetailedSchedule detailedSchedule) {
        this.detailedScheduleDao.insert(detailedSchedule);
        return detailedSchedule;
    }

    /**
     * 修改数据
     *
     * @param detailedSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public DetailedSchedule update(DetailedSchedule detailedSchedule) {
        this.detailedScheduleDao.update(detailedSchedule);
        return this.queryById(detailedSchedule.getDetailedScheduleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param detailedScheduleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long detailedScheduleId) {
        return this.detailedScheduleDao.deleteById(detailedScheduleId) > 0;
    }
}
