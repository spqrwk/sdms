package com.github.sdms.service;

import com.github.sdms.entity.Clazz;

import java.util.List;

/**
 * 班级信息(Clazz)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 10:38:00
 */
public interface ClazzService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Clazz queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Clazz> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    Clazz insert(Clazz clazz);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    Clazz update(Clazz clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}