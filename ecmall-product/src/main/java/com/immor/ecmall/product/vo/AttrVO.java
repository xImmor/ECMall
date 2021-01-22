package com.immor.ecmall.product.vo;

import com.immor.ecmall.product.entity.AttrEntity;
import lombok.Data;

/**
 * @Author: immor
 * @Date: 2021/1/22
 */
@Data
public class AttrVO extends AttrEntity {

    private Long attrId;

    private String attrName;

    private Integer searchType;

    private String icon;

    private String valueSelect;

    private Integer attrType;

    private Long enable;

    private Long catelogId;

    private Integer showDesc;

    private Long attrGroupId;

}
