package com.github.sdms.entity;

import com.github.sdms.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 宿舍信息(Dorm)实体类
 *
 * @author makejava
 * @since 2020-10-26 16:46:40
 */
public class Dorm implements Serializable {
    private static final long serialVersionUID = 597841468518678934L;
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
     * 公寓名称
     */
    private String aptName;
    /**
     * 最大住宿人数
     */
    private Integer tenantLimit;
    /**
     * 当前住宿人数
     */
    private Integer currentTenant;
    @Autowired
    private StuService stuService;

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

    public String getAptName() {
        return aptName;
    }

    public void setAptName(String aptName) {
        this.aptName = aptName;
    }

    public Integer getTenantLimit() {
        return tenantLimit;
    }

    public void setTenantLimit(Integer tenantLimit) {
        this.tenantLimit = tenantLimit;
    }

    public Integer getCurrentTenant() {
        return currentTenant;
    }

    public void setCurrentTenant(Integer currentTenant) {
        this.currentTenant = currentTenant;
    }

    @Override
    public String toString() {
        return "Dorm{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", aptName='" + aptName + '\'' +
                ", tenantLimit=" + tenantLimit +
                ", currentTenant=" + currentTenant +
                ", stuService=" + stuService +
                '}';
    }

    public Dorm(String code, Long monthlyRent, String aptName, Integer tenantLimit) {
        this.code = code;
        this.monthlyRent = monthlyRent;
        this.aptName = aptName;
        this.tenantLimit = tenantLimit;
    }

    public Dorm() {
    }
}