package com.github.sdms.service;

import com.github.sdms.entity.Clazz;
import com.github.sdms.util.Page;

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
     * @return 对象列表
     */
    Page<Clazz> queryAllByLimit(Integer currentPage, String clazzCode);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    void insert(Clazz clazz);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    void update(Clazz clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(Long id);

}