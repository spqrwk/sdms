package com.github.sdms.dao;

import com.github.sdms.entity.Dorm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 宿舍信息(Dorm)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 16:46:40
 */
public interface DormDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dorm queryById(Long id);

    /**
     * 查询指定行数据
     * @return 对象列表
     */
    List<Dorm> queryAllByLimit(Map<String, Object> params);

    Integer countByLimit(Map<String, Object> params);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dorm 实例对象
     * @return 对象列表
     */
    // List<Dorm> queryAll(Dorm dorm);

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 影响行数
     */
    int insert(Dorm dorm);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dorm> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dorm> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dorm> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Dorm> entities);

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 影响行数
     */
    int update(Dorm dorm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}