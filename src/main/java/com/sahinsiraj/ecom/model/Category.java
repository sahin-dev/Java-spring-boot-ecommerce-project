package com.sahinsiraj.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name = "categories")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categortyId;

    private String categoryName;



    public Category(Long categortyId, String categoryName) {
        this.categortyId = categortyId;
        this.categoryName = categoryName;
    }
    public Long getCategortyId() {
        return categortyId;
    }
    public void setCategortyId(Long categortyId) {
        this.categortyId = categortyId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
