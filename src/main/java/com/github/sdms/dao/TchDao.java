package com.github.sdms.dao;

import com.github.sdms.entity.Tch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Tch> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tch 实例对象
     * @return 对象列表
     */
    List<Tch> queryAll(Tch tch);

    /**
     * 新增数据
     *
     * @param tch 实例对象
     * @return 影响行数
     */
    int insert(Tch tch);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tch> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Tch> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tch> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Tch> entities);

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