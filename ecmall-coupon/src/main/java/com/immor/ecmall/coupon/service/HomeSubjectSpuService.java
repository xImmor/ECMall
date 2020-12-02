package com.immor.ecmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.immor.common.utils.PageUtils;
import com.immor.ecmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * ר????Ʒ
 *
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 10:26:13
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

