package org.chenguoyu.cloud.common.web.entity.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

/**
 * @author 陈国钰
 */
@Setter
@Getter
public class QueryForm<T extends BaseParam> {
    @Valid
    private T queryParam;

    private Page page;

}
