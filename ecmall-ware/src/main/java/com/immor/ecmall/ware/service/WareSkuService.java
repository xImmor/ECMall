package com.immor.ecmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.immor.common.utils.PageUtils;
import com.immor.ecmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * ??Ʒ???
 *
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 10:41:35
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

