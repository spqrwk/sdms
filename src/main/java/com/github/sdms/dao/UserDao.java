package com.github.sdms.dao;

import com.github.sdms.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 系统登录用户信息(User)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 09:41:01
 */
public interface UserDao {

    /**
     * 根据用户名查询单条数据
     * @param userCode
     * @return 实例对象
     */

    User queryByCode(String userCode);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<User> queryAllByLimit(Map<String, Object> params);

    Integer countByLimit(Map<String, Object> params);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}