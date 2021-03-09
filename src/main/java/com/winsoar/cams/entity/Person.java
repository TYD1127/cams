package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * 人员表(Person)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:25
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -27073792353792842L;
    /**
     * 主键id
     */
    private Long personId;
    /**
     * 人员名字
     */
    private String personName;
    /**
     * 1=老师,2=学生
     */
    private Integer personType;
    /**
     * 人员排序
     */
    private Integer personDesc;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 班级id
     */
    private Long classId;
    /**
     * 卡号
     */
    private String cardNum;


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonType() {
        return personType;
    }

    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    public Integer getPersonDesc() {
        return personDesc;
    }

    public void setPersonDesc(Integer personDesc) {
        this.personDesc = personDesc;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

}
