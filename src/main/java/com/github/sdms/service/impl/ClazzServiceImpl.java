package com.github.sdms.service.impl;

import com.github.sdms.dao.ClazzDao;
import com.github.sdms.entity.Clazz;
import com.github.sdms.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 班级信息(Clazz)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 10:38:00
 */
@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzDao clazzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Clazz queryById(Long id) {
        return this.clazzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Clazz> queryAllByLimit(int offset, int limit) {
        return this.clazzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public Clazz insert(Clazz clazz) {
        this.clazzDao.insert(clazz);
        return clazz;
    }

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public Clazz update(Clazz clazz) {
        this.clazzDao.update(clazz);
        return this.queryById(clazz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.clazzDao.deleteById(id) > 0;
    }
}