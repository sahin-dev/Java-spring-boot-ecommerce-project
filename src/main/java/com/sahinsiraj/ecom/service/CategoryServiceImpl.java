package com.sahinsiraj.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createCategory(Category category) {
        
        categoryRepository.save(category);

        return new ResponseEntity<>("Category created successfully", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow();

        categoryRepository.delete(category);

        return new ResponseEntity<String>("category deleted successfully",HttpStatus.OK);
    }

}
