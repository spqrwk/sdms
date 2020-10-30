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
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 影响行数
     */
    int insert(Dorm dorm);

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

    List<Dorm> queryAllAptName();

    List<Dorm> queryAllByAptName(String aptName);

    Integer countByANADC(@Param("aptName") String aptName, @Param("code") String code);
}