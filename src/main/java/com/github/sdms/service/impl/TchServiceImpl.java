package com.github.sdms.service.impl;

import com.github.sdms.dao.TchDao;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.TchService;
import com.github.sdms.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Tch queryById(@Param("id") Long id) {
        return this.tchDao.queryById(id);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public Page<Tch> queryAllByLimit(Integer currentPage, String tchName) {
        Page<Tch> pageBean = new Page<>(currentPage);

        HashMap<String, Object> params = new HashMap<>();
        params.put("tchName", tchName);

        int totalCount = tchDao.countByLimit(params);
        pageBean.setTotalCount(totalCount);

        params.put("startIndex", pageBean.getStartIndex());
        params.put("pageSize", pageBean.getPageSize());
        List<Tch> tchList = tchDao.queryAllByLimit(params);
        pageBean.setRows(tchList);

        return pageBean;
    }

    @Override
    public List<Tch> queryAllTch() {
        return tchDao.queryAllTch();
    }

    /**
     * 新增数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(Tch tch) {
        this.tchDao.insert(tch);
    }

    /**
     * 修改数据
     *
     * @param tch 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Tch tch) {
        this.tchDao.update(tch);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Long id) {
        tchDao.deleteById(id);
    }
}