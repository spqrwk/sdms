package com.github.sdms.service.impl;

import com.github.sdms.dao.ClazzDao;
import com.github.sdms.dao.StuDao;
import com.github.sdms.entity.Stu;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 学生信息(Stu)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 10:35:47
 */
@Service("stuService")
public class StuServiceImpl implements StuService {
    @Autowired
    private StuDao stuDao;

    @Autowired
    private ClazzDao clazzDao;

    @Override
    public int queryByDorm(Long dormId) {

        return stuDao.queryCountByDormId(dormId);

    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Stu queryById(Long id) {
        return this.stuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public Page<Stu> queryAllByLimit(Integer currentPage, Date startDate, Date endDate, String aptName, String tchName, String clazzCode){
        Page<Stu> pageBean = new Page<>(currentPage);

        HashMap<String, Object> params = new HashMap<>();
        params.put("startDate", startDate);
        params.put("endDate", endDate);
        params.put("aptName", aptName);
        params.put("tchName", tchName);
        params.put("clazzCode", clazzCode);

        int totalCount = stuDao.countByLimit(params);
        pageBean.setTotalCount(totalCount);

        params.put("startIndex", pageBean.getStartIndex());
        params.put("pageSize", pageBean.getPageSize());
        List<Stu> stuList = stuDao.queryAllByLimit(params);
        pageBean.setRows(stuList);

        return pageBean;

    }

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(Stu stu) {
        this.stuDao.insert(stu);
        if (clazzDao.queryByClazzCode(stu.getClazzCode()) == 0) {
            clazzDao.add(stu.getClazzCode());
        }
    }

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Stu stu) {
        this.stuDao.update(stu);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.stuDao.deleteById(id) > 0;
    }
}