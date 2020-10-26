package com.github.sdms.service.impl;

import com.github.sdms.dao.DormDao;
import com.github.sdms.entity.Dorm;
import com.github.sdms.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 宿舍信息(Dorm)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 10:25:39
 */
@Service("dormService")
public class DormServiceImpl implements DormService {
    @Autowired
    private DormDao dormDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dorm queryById(Long id) {
        return this.dormDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dorm> queryAllByLimit(int offset, int limit) {
        return this.dormDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public Dorm insert(Dorm dorm) {
        this.dormDao.insert(dorm);
        return dorm;
    }

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public Dorm update(Dorm dorm) {
        this.dormDao.update(dorm);
        return this.queryById(dorm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.dormDao.deleteById(id) > 0;
    }
}