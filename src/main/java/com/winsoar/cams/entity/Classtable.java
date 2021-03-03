package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * 班级表(Classtable)实体类
 *
 * @author makejava
 * @since 2021-02-18 17:05:03
 */
public class Classtable implements Serializable {
    private static final long serialVersionUID = 886473417790126677L;
    /**
     * 自增主键
     */
    private Long classId;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 班主任id：老师的person_id
     */
    private Long classMasterId;

    private Long classDesc;
    /**
     * 届id
     */
    private Long gradeId;
    /**
     * 创建人
     */
    private Long createUser;


    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getClassMasterId() {
        return classMasterId;
    }

    public void setClassMasterId(Long classMasterId) {
        this.classMasterId = classMasterId;
    }

    public Long getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(Long classDesc) {
        this.classDesc = classDesc;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

}
