package com.winsoar.cams.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Classroom)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:11
 */
public class Classroom implements Serializable {
    private static final long serialVersionUID = -69918723860368434L;
    /**
     * 教室id
     */
    private Long classRoomId;
    /**
     * 教室名称
     */
    private String classRoomName;
    /**
     * 教学楼id
     */
    private Long buildingId;
    /**
     * 教室号
     */
    private String classRoomNum;
    /**
     * 教室类型：实验室，标准教室
     */
    private String classRoomType;
    /**
     * 创建人
     */
    private Long createUser;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否删除 0:正常，1：删除
     */
    private Integer isDetele;


    public Long getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getClassRoomNum() {
        return classRoomNum;
    }

    public void setClassRoomNum(String classRoomNum) {
        this.classRoomNum = classRoomNum;
    }

    public String getClassRoomType() {
        return classRoomType;
    }

    public void setClassRoomType(String classRoomType) {
        this.classRoomType = classRoomType;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDetele() {
        return isDetele;
    }

    public void setIsDetele(Integer isDetele) {
        this.isDetele = isDetele;
    }

}
