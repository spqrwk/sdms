package com.github.sdms.entity;

import java.io.Serializable;

/**
 * 宿舍信息(Dorm)实体类
 *
 * @author makejava
 * @since 2020-10-26 10:25:38
 */
public class Dorm implements Serializable {
    private static final long serialVersionUID = -81116512243965999L;
    /**
     * 宿舍ID
     */
    private Long id;
    /**
     * 宿舍编码
     */
    private String code;
    /**
     * 单月费用
     */
    private Long monthlyRent;
    /**
     * 公寓ID
     */
    private Long aptName;

    private Integer dormMax;

    private Integer dormCurrent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Long monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public Long getAptName() {
        return aptName;
    }

    public void setAptName(Long aptName) {
        this.aptName = aptName;
    }

    public Integer getDormMax() {
        return dormMax;
    }

    public void setDormMax(Integer dormMax) {
        this.dormMax = dormMax;
    }

    public Integer getDormCurrent() {
        return dormCurrent;
    }

    public void setDormCurrent(Integer dormCurrent) {
        this.dormCurrent = dormCurrent;
    }

}