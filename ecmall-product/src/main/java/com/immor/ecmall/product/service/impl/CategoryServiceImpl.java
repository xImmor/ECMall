package com.immor.ecmall.product.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.immor.common.utils.PageUtils;
import com.immor.common.utils.Query;

import com.immor.ecmall.product.dao.CategoryDao;
import com.immor.ecmall.product.entity.CategoryEntity;
import com.immor.ecmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    /*@Autowired
    private CategoryDao categoryDao;*/

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        /*组装成父子结构树
         * 1）获得所有一级分类
         * */
        List<CategoryEntity> entitiesLev1 = entities.stream().filter(item -> item.getParentCid() == 0)
                .map(item -> {
                    item.setChildren(getChildrens(item, entities));
                    return item;
                }).sorted(Comparator.comparingInt(item -> (item.getSort() == null ? 0 : item.getSort()))).collect(Collectors.toList());

        return entitiesLev1;
    }

    /**
     * 递归查找所有菜单的子菜单
     *
     * @param root
     * @param all
     * @return
     */
    public List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> result = all.stream().filter(menu ->
            menu.getParentCid() == root.getCatId()
        ).map(menu -> {
            menu.setChildren(getChildrens(menu, all));
            return menu;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))).collect(Collectors.toList());
        return result;
    }

}