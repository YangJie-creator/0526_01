package com.yj.mall.controller;

import com.yj.mall.pojo.Category;
import com.yj.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Description:
 * @ Author: YangJie
 * @ time: 5.23 20:39
 **/
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model){
        System.out.println("到达controller");
        List<Category> cs = categoryService.list();
        model.addAttribute("cs", cs);
        return "admin/listCategory";
    }
}
