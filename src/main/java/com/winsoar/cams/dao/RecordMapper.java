package com.winsoar.cams.dao;

import com.winsoar.cams.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RecordMapper {
    int insert(Record record);

    int insertSelective(Record record);
}