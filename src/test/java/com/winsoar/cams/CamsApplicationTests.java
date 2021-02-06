package com.winsoar.cams;

import com.winsoar.cams.dao.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CamsApplicationTests {
    @Autowired
    private PersonMapper personMapper;

    @Test
    void Test1() {
        List person = personMapper.selectTeacherPerson();
        System.out.println(person.toString());
    }

}
