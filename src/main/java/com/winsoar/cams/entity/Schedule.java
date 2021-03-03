package com.winsoar.cams.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Schedule)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:27
 */
public class Schedule implements Serializable {
    private static final long serialVersionUID = -95091272155355605L;
    /**
     * 课表id
     */
    private Long scheduleId;
    /**
     * 课表名称
     */
    private String scheduleName;
    /**
     * 学年常量
     */
    private String schoolYear;
    /**
     * 学期
     */
    private String term;
    /**
     * 创建时间
     */
    private Date creatTime;
    /**
     * 创建人id
     */
    private Long createUser;


    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

}
