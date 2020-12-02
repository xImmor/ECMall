package com.immor.ecmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.immor.common.utils.PageUtils;
import com.immor.ecmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * ????????Ϣ
 *
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 10:38:30
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

