package com.sahinsiraj.ecom.model;


public class Category {

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
