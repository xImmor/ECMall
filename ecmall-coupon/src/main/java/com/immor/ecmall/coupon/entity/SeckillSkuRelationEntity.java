package com.immor.ecmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??ɱ???Ʒ????
 * 
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 10:26:13
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?id
	 */
	private Long promotionId;
	/**
	 * ?????id
	 */
	private Long promotionSessionId;
	/**
	 * ??Ʒid
	 */
	private Long skuId;
	/**
	 * ??ɱ?۸
	 */
	private BigDecimal seckillPrice;
	/**
	 * ??ɱ????
	 */
	private BigDecimal seckillCount;
	/**
	 * ÿ???޹??
	 */
	private BigDecimal seckillLimit;
	/**
	 * ???
	 */
	private Integer seckillSort;

}
