package com.retailweb.pearl;

public class ProductCategory {

    private int categoryId;
    private String categoryName;
    private String categoryCode;


    public ProductCategory(int categoryId, String categoryName, String categoryCode){

        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public int getCategoryId(){

        return categoryId;
    }

    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }

    public String getCategoryName(){

        return categoryName;
    }

    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }
    
    public String getCategoryCode(){

        return categoryCode;
    }

    public void setCategoryCode(String categoryCode){
        this.categoryCode = categoryCode;
    }
}
