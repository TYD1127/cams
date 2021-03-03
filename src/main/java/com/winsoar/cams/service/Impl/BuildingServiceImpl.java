package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Building;
import com.winsoar.cams.dao.BuildingDao;
import com.winsoar.cams.service.BuildingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Building)表服务实现类
 *
 * @author makejava
 * @since 2021-02-23 13:54:13
 */
@Service("buildingService")
public class BuildingServiceImpl implements BuildingService {
    @Resource
    private BuildingDao buildingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param buildingId 主键
     * @return 实例对象
     */
    @Override
    public Building queryById(Long buildingId) {
        return this.buildingDao.queryById(buildingId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Building> queryAllByLimit(int offset, int limit) {
        return this.buildingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    @Override
    public Building insert(Building building) {
        this.buildingDao.insert(building);
        return building;
    }

    /**
     * 修改数据
     *
     * @param building 实例对象
     * @return 实例对象
     */
    @Override
    public Building update(Building building) {
        this.buildingDao.update(building);
        return this.queryById(building.getBuildingId());
    }

    /**
     * 通过主键删除数据
     *
     * @param buildingId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long buildingId) {
        return this.buildingDao.deleteById(buildingId) > 0;
    }

    @Override
    public List<Map<String, Object>> queryByAll() {
        return buildingDao.queryByAll();
    }

    @Override
    public List<Map<String, Object>> toCkjs(String bid) {
        return buildingDao.toCkjs(bid);
    }
}
