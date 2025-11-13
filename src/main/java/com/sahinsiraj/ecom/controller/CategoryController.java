package com.sahinsiraj.ecom.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sahinsiraj.ecom.model.Category;
import com.sahinsiraj.ecom.service.CategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class CategoryController {

    private CategoryService categoryService;
    

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

  
    @PostMapping("/api/admin/categories")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);

        return "Cateogry added successfully";
    }

}
