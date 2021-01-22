package com.immor.ecmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.immor.common.utils.PageUtils;
import com.immor.ecmall.product.entity.AttrEntity;
import com.immor.ecmall.product.vo.AttrVO;

import java.util.Map;

/**
 * ??Ʒ?
 *
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 09:37:00
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVO attr);
}

