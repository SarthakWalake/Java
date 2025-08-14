package com.tap.sarthak.demo.Reporistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import com.tap.sarthak.demo.Entity.Product;

public class ProductReporistoryImpl implements ProductReporistory{
     public final List<Product> products = Collections.synchronizedList(new ArrayList<>());


     private void simulateDelay() {
        try { 
            Thread.sleep(500); 
           } catch (InterruptedException e) 
            { 
            Thread.currentThread().interrupt();
             }
    }
    
     @Override
     public CompletableFuture<Void> addProducts(Product product)
     {
       return CompletableFuture.runAsync(() ->{
        simulateDelay();
        products.add(product);
     });
    }


    @Override
    public CompletableFuture<Optional<Product>> getProductbyid(int id)
    {
        return CompletableFuture.supplyAsync(() ->{
            simulateDelay();
            return products.stream().filter(p -> p.getProductid() == id).findFirst();
        });
    }

    @Override
    public CompletableFuture<List<Product>> getAllProduct()
    {
        return CompletableFuture.supplyAsync(() ->{
            simulateDelay();
            return new ArrayList<>(products);
        });
    }

    @Override
    public CompletableFuture<Void> updateProduct(Product updatedProduct)
    {
        return CompletableFuture.runAsync(() ->{
            simulateDelay();
            for(int i =0 ; i < products.size() ; i++)
            {
                if(products.get(i).getProductid()==updatedProduct.getProductid())
                {
                    products.set(i,updatedProduct);
                    return;
                }
            }
        });
    }

    @Override
    public CompletableFuture<Boolean> deleteProduct(int id)
    {
        return CompletableFuture.supplyAsync(() ->{
            simulateDelay();
            return products.removeIf(p -> p.getProductid() == id);
        });
    }

   
    
}
