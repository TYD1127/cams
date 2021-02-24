package com.winsoar.cams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.winsoar.cams.dao")
@SpringBootApplication
public class CamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamsApplication.class, args);
    }

}
