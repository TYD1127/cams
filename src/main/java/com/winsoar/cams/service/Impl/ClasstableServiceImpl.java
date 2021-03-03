package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Classtable;
import com.winsoar.cams.dao.ClasstableDao;
import com.winsoar.cams.service.ClasstableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 班级表(Classtable)表服务实现类
 *
 * @author makejava
 * @since 2021-02-18 17:05:06
 */
@Service("classtableService")
public class ClasstableServiceImpl implements ClasstableService {
    @Resource
    private ClasstableDao classtableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    @Override
    public Classtable queryById(Long classId) {
        return this.classtableDao.queryById(classId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Classtable> queryAllByLimit(int offset, int limit) {
        return this.classtableDao.queryAllByLimit(offset, limit);
    }
    @Override
    public List<Map<String, Object>> queryAllInfo() {
        return this.classtableDao.queryAllInfo();
    }

    /**
     * 新增数据
     *
     * @param classtable 实例对象
     * @return 实例对象
     */
    @Override
    public Classtable insert(Classtable classtable) {
        this.classtableDao.insert(classtable);
        return classtable;
    }

    /**
     * 修改数据
     *
     * @param classtable 实例对象
     * @return 实例对象
     */
    @Override
    public Classtable update(Classtable classtable) {
        this.classtableDao.update(classtable);
        return this.queryById(classtable.getClassId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long classId) {
        return this.classtableDao.deleteById(classId) > 0;
    }
}
