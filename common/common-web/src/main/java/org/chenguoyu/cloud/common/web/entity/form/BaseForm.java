package org.chenguoyu.cloud.common.web.entity.form;

import org.chenguoyu.cloud.common.web.entity.po.BasePo;
import org.springframework.beans.BeanUtils;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public class BaseForm<T extends BasePo> {
    /**
     * From转化为Po，进行后续业务处理
     *
     * @param clazz
     * @return
     */
    public T toPo(Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(this, t);
        return t;
    }

    /**
     * From转化为Po，进行后续业务处理
     *
     * @param id
     * @param clazz
     * @return
     */
    public T toPo(Long id, Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        t.setId(id);
        BeanUtils.copyProperties(this, t);
        return t;
    }
}
