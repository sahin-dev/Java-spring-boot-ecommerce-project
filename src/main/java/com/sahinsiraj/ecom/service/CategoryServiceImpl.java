package com.sahinsiraj.ecom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahinsiraj.ecom.model.Category;
import com.sahinsiraj.ecom.repositories.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        
       return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        
        categoryRepository.save(category);
    }

}
