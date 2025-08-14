package com.tap.sarthak.demo.Entity;

public class Product {
    private int id;
    private String name;
    private int price;

    Product()
    {

    }

    public Product(int id ,String name ,int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getProductid()
    {
        return id;
    }

    public void setProductid(int id)
    {
        this.id = id;
    }

    public String getProductname()
    {
        return name;
    }

    public void settProductname(String name)
    {
        this.name = name;
    }

    public int getProductprice()
    {
        return price; 
    }

    public void setProductprice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product[id = "+id+"name = "+name+"price = "+price+"]";
    }


    
}
