package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * (DetailedSchedule)实体类
 *
 * @author makejava
 * @since 2021-02-06 16:27:18
 */
public class DetailedSchedule implements Serializable {
    private static final long serialVersionUID = 704695504754604542L;
    /**
     * 详细课表id
     */
    private Long detailedScheduleId;
    /**
     * 课表id
     */
    private Long scheduleId;
    /**
     * 班级id
     */
    private Long classId;
    /**
     * 教室id
     */
    private Long classRoomId;
    /**
     * 教师id
     */
    private Long personId;
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 周几
     */
    private Integer day;
    /**
     * 第几节
     */
    private Integer part;


    public Long getDetailedScheduleId() {
        return detailedScheduleId;
    }

    public void setDetailedScheduleId(Long detailedScheduleId) {
        this.detailedScheduleId = detailedScheduleId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

}
