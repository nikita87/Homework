package com.teachmeskills.rakhubovskiy.metoda.lesson10.shop;

public class Product {

    private Integer id;
    private String productName;
    private Double price;
    private static Integer currentId = 1;

    public Product(String productName, Double price) {
        this.id = currentId;
        this.productName = productName;
        this.price = price;
        Product.currentId++;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
