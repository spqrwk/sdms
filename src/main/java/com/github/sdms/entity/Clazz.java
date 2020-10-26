package com.github.sdms.entity;

import java.io.Serializable;

/**
 * 班级信息(Clazz)实体类
 *
 * @author makejava
 * @since 2020-10-26 10:38:00
 */
public class Clazz implements Serializable {
    private static final long serialVersionUID = -18097805665083567L;
    /**
     * 班级ID
     */
    private Long id;
    /**
     * 班级编号
     */
    private String code;
    /**
     * 班主任ID
     */
    private Long tchId;


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

    public Long getTchId() {
        return tchId;
    }

    public void setTchId(Long tchId) {
        this.tchId = tchId;
    }

}