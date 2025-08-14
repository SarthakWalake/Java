package com.tap.sarthak.demo;

import java.util.List;

import com.tap.sarthak.demo.Entity.Product;
import com.tap.sarthak.demo.Reporistory.ProductReporistory;
import com.tap.sarthak.demo.Reporistory.ProductReporistoryImpl;


public class App 
{
   public static void main(String[] args) throws Exception {
        ProductReporistory repo = new ProductReporistoryImpl();

        
        // Add Products
        repo.addProducts(new Product(1, "Laptop", 79999)).get();
        repo.addProducts(new Product(2, "Phone", 29999)).get();

        // Get All 
        List<Product> all = repo.getAllProduct().get();
        System.out.println("All Products: " + all);

        // Update
        repo.updateProduct(new Product(2, "Smartphone", 24999)).get();

        // Get by ID
        Product p = repo.getProductbyid(2).get().orElse(null);
        System.out.println("Product with ID 2: " + p);

        // Delete
       repo.deleteProduct(1).get();
       System.out.println("Delete Operation Performed Successfully");

        // Final List
        System.out.println("Final Products: " + repo.getAllProduct().get());
    }
}
