package com.github.sdms.service.impl;

import com.github.sdms.dao.TchDao;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.TchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 班主任信息(Tch)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 09:40:42
 */
@Service("tchService")
public class TchServiceImpl implements TchService {
    @Autowired
    private TchDao tchDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Tch queryById(Long id) {
        return this.tchDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Tch> queryAllByLimit(int offset, int limit) {
        return this.tchDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    @Override
    public Tch insert(Tch tch) {
        this.tchDao.insert(tch);
        return tch;
    }

    /**
     * 修改数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    @Override
    public Tch update(Tch tch) {
        this.tchDao.update(tch);
        return this.queryById(tch.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tchDao.deleteById(id) > 0;
    }
}