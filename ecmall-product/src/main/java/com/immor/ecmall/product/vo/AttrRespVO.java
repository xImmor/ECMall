package com.immor.ecmall.product.vo;

import lombok.Data;

/**
 * @Author: immor
 * @Date: 2021/1/22
 */
@Data
public class AttrRespVO extends AttrVO {

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
