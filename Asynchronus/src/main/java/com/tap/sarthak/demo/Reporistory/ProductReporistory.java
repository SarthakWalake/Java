package com.tap.sarthak.demo.Reporistory;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import com.tap.sarthak.demo.Entity.Product;

public interface ProductReporistory {
    CompletableFuture<Void> addProducts(Product product);
    CompletableFuture<Optional<Product>> getProductbyid(int id);
    CompletableFuture<List<Product>> getAllProduct();
    CompletableFuture<Void> updateProduct(Product product);
    CompletableFuture<Boolean> deleteProduct(int id);
    

}
