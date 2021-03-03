package com.winsoar.cams.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Foodcard)实体类
 *
 * @author makejava
 * @since 2021-02-22 16:46:38
 */
public class Foodcard implements Serializable {
    private static final long serialVersionUID = 303084501450283809L;
    /**
     * 饭卡id
     */
    private Long foodcardId;
    /**
     * 用户id
     */
    private Long personId;
    /**
     * 创建时间
     */
    private Date creatTime;
    /**
     * 余额
     */
    private Double balance;
    /**
     * 卡号
     */
    private String cardNum;
    /**
     * 是否删除 0:正常,1:删除
     */
    private Integer isDetele;


    public Long getFoodcardId() {
        return foodcardId;
    }

    public void setFoodcardId(Long foodcardId) {
        this.foodcardId = foodcardId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getIsDetele() {
        return isDetele;
    }

    public void setIsDetele(Integer isDetele) {
        this.isDetele = isDetele;
    }

}
