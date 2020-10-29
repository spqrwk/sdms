package com.github.sdms.service.impl;

import com.github.sdms.dao.DormDao;
import com.github.sdms.entity.Dorm;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.DormService;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 宿舍信息(Dorm)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 16:46:41
 */
@Service("dormService")
public class DormServiceImpl implements DormService {
    @Autowired
    private DormDao dormDao;
    @Autowired
    private StuService stuService;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dorm queryById(Long id) {
        Dorm dorm=this.dormDao.queryById(id);
        dorm.setCurrentTenant(stuService.queryByDorm(dorm.getId()));
        return dorm;
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public Page<Dorm> queryAllByLimit(Integer currentPage, String dormCode, String aptName) {
        Page<Dorm> pageBean = new Page<>(currentPage);

        HashMap<String, Object> params = new HashMap<>();
        params.put("dormCode", dormCode);
        params.put("aptName", aptName);

        int totalCount = dormDao.countByLimit(params);
        pageBean.setTotalCount(totalCount);

        params.put("startIndex", pageBean.getStartIndex());
        params.put("pageSize", pageBean.getPageSize());
        List<Dorm> dormList = dormDao.queryAllByLimit(params);
        for (Dorm dorm:dormList) {
            dorm.setCurrentTenant(stuService.queryByDorm(dorm.getId()));
        }
        pageBean.setRows(dormList);

        return pageBean;
    }

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(Dorm dorm) {
        this.dormDao.insert(dorm);
    }

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Dorm dorm) {
        this.dormDao.update(dorm);
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

    @Override
    public List<Dorm> queryAllAptName() {
        return dormDao.queryAllAptName();
    }

    @Override
    public List<Dorm> queryAllByAptName(String aptName) {
        return dormDao.queryAllByAptName(aptName);
    }
}