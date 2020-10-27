package com.github.sdms.service;

import com.github.sdms.entity.Stu;
import com.github.sdms.util.Page;

import java.util.Date;
import java.util.List;

/**
 * 学生信息(Stu)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 10:35:47
 */
public interface StuService {


    int queryByDorm(Long dormId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stu queryById(Long id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    Page<Stu> queryAllByLimit(Integer currentPage, Date startDate, Date endDate, String aptName, String tchName, String clazzCode);

    /**
     * 新增数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    void insert(Stu stu);

    /**
     * 修改数据
     *
     * @param stu 实例对象
     * @return 实例对象
     */
    void update(Stu stu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}