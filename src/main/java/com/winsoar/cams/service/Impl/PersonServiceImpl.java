package com.winsoar.cams.service.Impl;

import com.winsoar.cams.entity.Person;
import com.winsoar.cams.dao.PersonDao;
import com.winsoar.cams.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员表(Person)表服务实现类
 *
 * @author makejava
 * @since 2021-02-06 16:27:26
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;

    /**
     * 通过ID查询单条数据
     *
     * @param personId 主键
     * @return 实例对象
     */
    @Override
    public Person queryById(Long personId) {
        return this.personDao.queryById(personId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Person> queryAllByLimit(int offset, int limit) {
        return this.personDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    @Override
    public Person insert(Person person) {
        this.personDao.insert(person);
        return person;
    }

    /**
     * 修改数据
     *
     * @param person 实例对象
     * @return 实例对象
     */
    @Override
    public Person update(Person person) {
        this.personDao.update(person);
        return this.queryById(person.getPersonId());
    }

    /**
     * 通过主键删除数据
     *
     * @param personId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long personId) {
        return this.personDao.deleteById(personId) > 0;
    }

    @Override
    public Map<String, Object> checkname(String personName) {
        return personDao.checkname(personName);
    }

    @Override
    public Map<String, Object> checkmobile(String mobile) {
        return  personDao.checkmobile(mobile);
    }
}
