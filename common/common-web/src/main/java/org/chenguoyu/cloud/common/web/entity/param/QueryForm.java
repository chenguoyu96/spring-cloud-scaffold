package org.chenguoyu.cloud.common.web.entity.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.validation.Valid;

/**
 * @author 陈国钰
 */
public class QueryForm<T extends BaseParam> {
    @Valid
    private T queryParam;

    private Page page;

    public T getQueryParam() {
        return queryParam;
    }

    public QueryForm<T> setQueryParam(T queryParam) {
        this.queryParam = queryParam;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
