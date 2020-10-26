package com.github.sdms.dao;

import com.github.sdms.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 学生信息(Stu)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 10:35:47
 */
public interface StuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Stu> queryAllByLimit(Map<String, Object> params);

    Integer countByLimit(Map<String, Object> params);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param stu 实例对象
     * @return 对象列表
     */
    List<Stu> queryAll(Stu stu);

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 影响行数
     */
    int insert(Stu stu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Stu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stu> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Stu> entities);

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 影响行数
     */
    int update(Stu stu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}