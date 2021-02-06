package com.winsoar.cams.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long personId;

    private String personName;

    private Integer personType;

    private Integer personDesc;

    private String mobile;

    private Long classId;

    private String cardNum;

    private String className;
}