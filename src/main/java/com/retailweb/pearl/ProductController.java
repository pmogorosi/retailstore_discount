package com.retailweb.pearl;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ProductController {

@Autowired
private IProductService productService;

@GetMapping(value= "/product")
public List<Product> getProduct(){

List<Product> products = productService.getAllProducts();

return products;
}
    
}
