package com.yj.mall.service.impl;

import com.yj.mall.mapper.CategoryMapper;
import com.yj.mall.pojo.Category;
import com.yj.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Description:
 * @ Author: YangJie
 * @ time: 5.23 22:22
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list() {
        return categoryMapper.list();
    }
}
