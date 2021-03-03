package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * (Result)实体类
 *
 * @author makejava
 * @since 2021-02-20 11:58:37
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -97346915337103114L;
    /**
     * 成绩id
     */
    private Long resultId;
    /**
     * 课程id，科目
     */
    private Long courseId;
    /**
     * 学生id
     */
    private Long personId;
    /**
     * 班级id
     */
    private Long classId;
    /**
     * 分数
     */
    private Integer score;
    /**
     * 0:未通过，1：通过
     */
    private Integer passed;
    /**
     * 届id
     */
    private Long gradeId;
    /**
     * 学年
     */
    private Long schoolYear;


    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPassed() {
        return passed;
    }

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Long schoolYear) {
        this.schoolYear = schoolYear;
    }

}
