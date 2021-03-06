package com.immor.ecmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.immor.common.utils.PageUtils;
import com.immor.ecmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author shenxian
 * @email shenxian@gmail.com
 * @date 2020-12-02 09:37:00
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}

