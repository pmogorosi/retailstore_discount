package com.retailweb.pearl;


public class Product {

    private int productId;
    private String productName;
    private String productCode;
    private int productCategoryId;
    private double price;


    public Product(int productId, String productName, String productCode, int productCategoryId,
                    double price){

        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.productCategoryId = productCategoryId;
        this.price = price;
       }

    public int getProductId(){

        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName(){

        return productName;
    }

    public void setProductName(String productName){

        this.productName = productName;

    }

    public String getProductCode(){

        return productCode;
    }

    public void setProductCode(String productCode){

        this.productCode = productCode;
    }

    public int getProductCategoryId(){

        return productCategoryId;
    }

    public void setProductCategory(int productCategoryId){

        this.productCategoryId = productCategoryId;
    }

    public double getProductPrice(){

        return price;
    }

    public void setProductPrice(double price){

        this.price = price;
    }

    
}
