package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Classroom;
import com.winsoar.cams.dao.ClassroomDao;
import com.winsoar.cams.service.ClassroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Classroom)表服务实现类
 *
 * @author makejava
 * @since 2021-02-06 16:27:13
 */
@Service("classroomService")
public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomDao classroomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classRoomId 主键
     * @return 实例对象
     */
    @Override
    public Classroom queryById(Long classRoomId) {
        return this.classroomDao.queryById(classRoomId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Classroom> queryAllByLimit(int offset, int limit) {
        return this.classroomDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    @Override
    public Classroom insert(Classroom classroom) {
        this.classroomDao.insert(classroom);
        return classroom;
    }

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    @Override
    public Classroom update(Classroom classroom) {
        this.classroomDao.update(classroom);
        return this.queryById(classroom.getClassRoomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classRoomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long classRoomId) {
        return this.classroomDao.deleteById(classRoomId) > 0;
    }
}
