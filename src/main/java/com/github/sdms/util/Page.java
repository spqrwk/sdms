package com.github.sdms.util;

import java.util.List;

/**
 * 分页工具类
 *
 * @param <T>
 * @author Charles7c
 * @date 2020年9月4日 下午4:47:23
 */
public class Page<T> {

    /**
     * 当前页码：从前端传过来
     */
    private Integer currentPage;
    /**
     * 每页显示多少条数据：可以从前端传过来
     */
    private Integer pageSize;
    /**
     * 总数据量：查询数据库
     */
    private Integer totalCount;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 每一页的数据集合：查询数据库
     */
    private List<T> rows;

    private Integer startIndex;

    // (当前页 - 1) * 每页显示条数
    public Integer getStartIndex() {
        return (currentPage - 1) * pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    // 当设置数据总量时，计算总页数
    public void setTotalCount(Integer totalCount) {
        if (totalCount > 0) {
            // 总记录数/每页显示条数
            this.totalPage = (totalCount % pageSize == 0) ?
                    totalCount / pageSize :
                    (totalCount / pageSize) + 1;
        }
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Page(Integer currentPage) {
        super();
        this.currentPage = currentPage;
        this.pageSize = 5;
    }

    public Page() {
        super();
    }
}
