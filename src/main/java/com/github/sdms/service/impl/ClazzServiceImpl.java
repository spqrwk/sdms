package com.github.sdms.service.impl;

import com.github.sdms.dao.ClazzDao;
import com.github.sdms.dao.StuDao;
import com.github.sdms.dao.TchDao;
import com.github.sdms.entity.Clazz;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.ClazzService;
import com.github.sdms.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * 班级信息(Clazz)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 10:38:00
 */
@Transactional(rollbackFor = Exception.class)
@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzDao clazzDao;
    @Autowired
    private TchDao tchDao;
    @Autowired
    private StuDao stuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Clazz queryById(Long id) {
        Clazz clazz = clazzDao.queryById(id);
        clazz.setTchName(tchDao.queryById(clazz.getTchId()).getName());
        return clazz;
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public Page<Clazz> queryAllByLimit(Integer currentPage, String clazzCode) {
        Page<Clazz> pageBean = new Page<>(currentPage);

        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("clazzCode", clazzCode);

        int totalCount = clazzDao.countByLimit(params);
        pageBean.setTotalCount(totalCount);

        params.put("startIndex", pageBean.getStartIndex());
        params.put("pageSize", pageBean.getPageSize());
        List<Clazz> clazzList = clazzDao.queryAllByLimit(params);
        pageBean.setRows(clazzList);

        return pageBean;
    }

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(Clazz clazz) {
        this.clazzDao.insert(clazz);
    }

    @Override
    public void add(String code) {
        this.clazzDao.add(code);
    }

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Clazz clazz) {
        this.clazzDao.update(clazz);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Long id, String clazzCode) {
        clazzDao.deleteById(id);
        stuDao.delStu(clazzCode);
    }

    @Override
    public List<Clazz> queryAllClazz() {
        return clazzDao.queryAllClazz();
    }

    @Override
    public int querybycode(String clazzCode) {
        return clazzDao.queryByClazzCode(clazzCode);
    }
}