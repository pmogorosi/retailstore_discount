package com.retailweb.pearl;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ProductCategoryController {

@Autowired
private ICategoryService productCategoryService;

@GetMapping(value = "/category")
public List<ProductCategory> getCategory(){


    List<ProductCategory> categories = productCategoryService.getAllCategories();

    return categories;
}
    
}
