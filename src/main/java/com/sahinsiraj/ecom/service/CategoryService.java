package com.sahinsiraj.ecom.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sahinsiraj.ecom.model.Category;

public interface CategoryService {

    List<Category> getAllCategories();

    ResponseEntity<String> createCategory(Category category);
    ResponseEntity<String> deleteCategory(Long categoryId);

}
