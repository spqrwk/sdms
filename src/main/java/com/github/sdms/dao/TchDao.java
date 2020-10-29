package com.github.sdms.dao;

import com.github.sdms.entity.Tch;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 班主任信息(Tch)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 09:40:42
 */
public interface TchDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Tch queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<Tch> queryAllByLimit(Map<String, Object> map);

    List<Tch> queryAllTch();

    /**
     * 根据条件查询记录数
     * @param map
     * @return
     */
    int countByLimit(Map<String, Object> map);

    /**
     * 新增数据
     *
     * @param tch 实例对象
     * @return 影响行数
     */
    int insert(Tch tch);

    /**
     * 修改数据
     *
     * @param tch 实例对象
     * @return 影响行数
     */
    int update(Tch tch);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}