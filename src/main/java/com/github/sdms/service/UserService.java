package com.github.sdms.service;

import com.github.sdms.entity.User;
import com.github.sdms.util.Page;

import java.util.List;

/**
 * 系统登录用户信息(User)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 09:41:01
 */
public interface UserService {


   User queryByCode(String code);


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    Page<User> queryAllByLimit(Integer currentPage, String userCode, String username);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    void insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    void update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}