package com.teachmeskills.rakhubovskiy.metoda.lesson10.shop;

public class Product {

    private Integer id;
    private String productName;
    private Double price;

    public Product(String productName, Double price) {
        this.id = AutoIncrement.nextId();
        this.productName = productName;
        this.price = price;
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
