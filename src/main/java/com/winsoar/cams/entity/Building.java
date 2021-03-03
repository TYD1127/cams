package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * (Building)实体类
 *
 * @author makejava
 * @since 2021-02-23 13:54:09
 */
public class Building implements Serializable {
    private static final long serialVersionUID = 581659924387537634L;
    /**
     * 教学楼Id
     */
    private Long buildingId;
    /**
     * 教学楼名称
     */
    private String buildingName;


    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

}
