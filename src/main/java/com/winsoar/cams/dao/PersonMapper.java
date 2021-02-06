package com.winsoar.cams.dao;

import com.winsoar.cams.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PersonMapper {
    int deleteByPrimaryKey(Long personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long personId);

    List<Person> selectTeacherPerson();

    List<Person> selectStudentPerson();

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}