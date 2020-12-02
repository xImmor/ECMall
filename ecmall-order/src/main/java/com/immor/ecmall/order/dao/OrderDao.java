package com.immor.ecmall.order.dao;

import com.immor.ecmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ????
 * 
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 10:38:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
