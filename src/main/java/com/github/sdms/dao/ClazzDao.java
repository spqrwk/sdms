package com.github.sdms.dao;

import com.github.sdms.entity.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 班级信息(Clazz)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 10:38:00
 */
public interface ClazzDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Clazz queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<Clazz> queryAllByLimit(Map<String, Object> params);

    Integer countByLimit(Map<String, Object> params);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int insert(Clazz clazz);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int update(Clazz clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}