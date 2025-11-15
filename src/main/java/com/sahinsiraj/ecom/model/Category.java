package com.sahinsiraj.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;

@Entity(name = "categories")
@NoArgsConstructor
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @NotBlank
    private String categoryName;

    public Category(Long categortyId, String categoryName) {
        this.categoryId = categortyId;
        this.categoryName = categoryName;
    }

    public Long getCategortyId() {
        return categoryId;
    }

    public void setCategortyId(Long categortyId) {
        this.categoryId = categortyId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
