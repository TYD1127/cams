package com.winsoar.cams.dao;

import com.winsoar.cams.pojo.Class;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ClassMapper {
    int deleteByPrimaryKey(Long classId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Long classId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);

}