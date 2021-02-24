package com.winsoar.cams;

import com.winsoar.cams.dao.ClasstableDao;
import com.winsoar.cams.dao.PersonMapper;
import com.winsoar.cams.entity.Classtable;
import com.winsoar.cams.service.ClasstableService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class CamsApplicationTests {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private ClasstableDao classtableService;
    @Autowired
    private ClasstableService classtable;

    @Test
    void Test1() {
        List<Map<String, Object>> classtables = classtable.queryAllInfo();
        System.out.println(classtables);
    }

}
