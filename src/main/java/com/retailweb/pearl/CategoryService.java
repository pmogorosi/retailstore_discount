package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

@Override
public List<ProductCategory> getAllCategories(){

    ArrayList<ProductCategory> categories =new ArrayList<ProductCategory>();

        categories.add(new ProductCategory(101, "Groceries", "CT1"));
        categories.add(new ProductCategory(102, "Toiletries", "CT2"));
        categories.add(new ProductCategory(103, "Electronics", "CT3"));

        return categories;
    }


} 
    

