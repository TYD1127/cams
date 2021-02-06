package com.winsoar.cams.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    private Long classId;

    private String className;

    private Long classMasterId;

    private Long classDesc;

}