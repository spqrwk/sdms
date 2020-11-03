package com.github.sdms.entity;

import java.io.Serializable;

/**
 * 班主任信息(Tch)实体类
 *
 * @author makejava
 * @since 2020-10-26 09:40:42
 */
public class Tch implements Serializable {
    private static final long serialVersionUID = 325829264782563067L;
    /**
     * 班主任ID
     */
    private Long id;
    /**
     * 班主任姓名
     */
    private String name;
    /**
     * 班级ID
     */
    private Long clazzId;


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

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public Tch(String name) {
        this.name = name;
    }

    public Tch() {
    }
}