package com.github.sdms.service;

import com.github.sdms.entity.Tch;

import java.util.List;

/**
 * 班主任信息(Tch)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 09:40:42
 */
public interface TchService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Tch queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Tch> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    Tch insert(Tch tch);

    /**
     * 修改数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    Tch update(Tch tch);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}