package com.winsoar.cams.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Grade)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:21
 */
public class Grade implements Serializable {
    private static final long serialVersionUID = -16583779091616935L;
    /**
     * 年级id
     */
    private Long gradeId;
    /**
     * 年级名称
     */
    private String gradeName;
    /**
     * 届
     */
    private String gradleLevel;
    /**
     * 创建时间
     */
    private Date createDate;


    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradleLevel() {
        return gradleLevel;
    }

    public void setGradleLevel(String gradleLevel) {
        this.gradleLevel = gradleLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
