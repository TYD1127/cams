package com.winsoar.cams.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:15
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 980526359745800109L;
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 是否可用
     */
    private Integer enable;
    /**
     * 特殊教室id
     */
    private Long specialCR;


    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Long getSpecialCR() {
        return specialCR;
    }

    public void setSpecialCR(Long specialCR) {
        this.specialCR = specialCR;
    }

}
