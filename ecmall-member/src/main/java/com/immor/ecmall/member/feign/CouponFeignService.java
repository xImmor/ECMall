package com.immor.ecmall.member.feign;

import com.immor.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: immor
 * @Date: 2020/12/2
 */
@FeignClient("ecmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();

}
