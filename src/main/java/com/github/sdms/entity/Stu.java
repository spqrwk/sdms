package com.github.sdms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生信息(Stu)实体类
 *
 * @author makejava
 * @since 2020-10-26 10:35:47
 */
public class Stu implements Serializable {
    private static final long serialVersionUID = 992958436759189400L;
    /**
     * 学生ID
     */
    private Long id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生身份证号
     */
    private String idNo;
    /**
     * 班级ID
     */
    private String clazzCode;
    /**
     * 宿舍ID
     */
    private Long dormId;
    /**
     * 入住日期
     */
    private Date checkInDate;
    /**
     * 缴费截止日期
     */
    private Date paymentDeadline;
    /**
     * 备注
     */
    private String remarks;

    private String tchName;

    private String dormCode;

    private String aptName;

    private String tenantLimit;

    private String monthlyRent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getClazzCode() {
        return clazzCode;
    }

    public void setClazzCode(String clazzCode) {
        this.clazzCode = clazzCode;
    }

    public Long getDormId() {
        return dormId;
    }

    public void setDormId(Long dormId) {
        this.dormId = dormId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getPaymentDeadline() {
        return paymentDeadline;
    }

    public void setPaymentDeadline(Date paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTchName() {
        return tchName;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName;
    }

    public String getDormCode() {
        return dormCode;
    }

    public void setDormCode(String dormCode) {
        this.dormCode = dormCode;
    }

    public String getAptName() {
        return aptName;
    }

    public void setAptName(String aptName) {
        this.aptName = aptName;
    }

    public String getTenantLimit() {
        return tenantLimit;
    }

    public void setTenantLimit(String tenantLimit) {
        this.tenantLimit = tenantLimit;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}