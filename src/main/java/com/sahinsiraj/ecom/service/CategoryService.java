package com.sahinsiraj.ecom.service;

import java.util.List;

import com.sahinsiraj.ecom.model.Category;

public interface CategoryService {

    List<Category> getAllCategories();

    void createCategory(Category category);

}
