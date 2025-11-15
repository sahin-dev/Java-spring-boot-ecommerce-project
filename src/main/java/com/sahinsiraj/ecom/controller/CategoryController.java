package com.sahinsiraj.ecom.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sahinsiraj.ecom.model.Category;
import com.sahinsiraj.ecom.service.CategoryService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String createCategory(@Valid @RequestBody Category category){
        categoryService.createCategory(category);

        return "Cateogry added successfully";
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
        return categoryService.deleteCategory(categoryId);
    }

}
