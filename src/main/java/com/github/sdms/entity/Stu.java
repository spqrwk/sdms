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
    private Long clazzCode;
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

    public Long getClazzCode() {
        return clazzCode;
    }

    public void setClazzCode(Long clazzCode) {
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

}