package com.github.sdms.service;

import com.github.sdms.entity.Dorm;

import java.util.List;

/**
 * 宿舍信息(Dorm)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 10:25:38
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
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dorm> queryAllByLimit(int offset, int limit);

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