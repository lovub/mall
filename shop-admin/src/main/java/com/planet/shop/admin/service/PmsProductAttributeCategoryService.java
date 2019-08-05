package com.planet.shop.admin.service;

import com.planet.shop.mbg.model.PmsProductAttributeCategory;
import com.planet.shop.admin.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 商品属性分类Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeCategoryService {
    int create(String name);

    int update(Long id, String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
