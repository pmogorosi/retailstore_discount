package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

@Override
public List<Product> getAllProducts(){

    ArrayList<Product> products = new ArrayList<Product>();

    products.add(new Product(200, "Carrot Pack", "G56", 101, 9.95));
    products.add(new Product(201, "Rice 10kg ", "G50", 101, 101.95));
    products.add(new Product(202, "Five Roses Loose 10g", "G53", 101, 12.45));
    products.add(new Product(203, "Globe Screw", "T78", 103, 15));
    products.add(new Product(204, "Extension Cord 1M", "G46", 103, 125.50));
    products.add(new Product(205, "Nivea Men RollOn", "T67", 102, 20.90));
    products.add(new Product(206, "Kotext Pads maxi", "T97", 102, 44.95));


    return products;

}
    
}
