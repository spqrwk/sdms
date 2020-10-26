package com.github.sdms.service;

import com.github.sdms.entity.Dorm;
import com.github.sdms.util.Page;

import java.util.List;

/**
 * 宿舍信息(Dorm)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 16:46:40
 */
public interface DormService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dorm queryById(Long id);

    /**
     * 查询多条数据
     * @return 对象列表
     */
    Page<Dorm> queryAllByLimit(Integer currentPage, String dormCode, String aptName);

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    Dorm insert(Dorm dorm);

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    Dorm update(Dorm dorm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}