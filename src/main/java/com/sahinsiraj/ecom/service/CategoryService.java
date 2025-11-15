package com.sahinsiraj.ecom.service;

import com.sahinsiraj.ecom.dtos.CategoryDTO;
import com.sahinsiraj.ecom.apiResponses.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
