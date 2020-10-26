package com.github.sdms.service.impl;

import com.github.sdms.dao.UserDao;
import com.github.sdms.entity.Tch;
import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 系统登录用户信息(User)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 09:41:01
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User queryByCode(String code) {
        return userDao.queryByCode(code);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public Page<User> queryAllByLimit(Integer currentPage, String userCode, String username) {
        Page<User> pageBean = new Page<>(currentPage);

        HashMap<String, Object> params = new HashMap<>();
        params.put("userCode", userCode);
        params.put("username", username);

        int totalCount = userDao.countByLimit(params);
        pageBean.setTotalCount(totalCount);

        params.put("startIndex", pageBean.getStartIndex());
        params.put("pageSize", pageBean.getPageSize());
        List<User> userList = userDao.queryAllByLimit(params);
        pageBean.setRows(userList);

        return pageBean;    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userDao.deleteById(id) > 0;
    }
}