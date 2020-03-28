package com.teachmeskills.rakhubovskiy.metoda.lesson10.shop;

import java.util.*;

public class Shop {

    private List<Product> productList = new ArrayList<>();

    public void addItem(Product product){
        productList.add(product);
    }

    public void getAllItems(){
        System.out.println(productList.toString());
    }

    public Product getItemById(int id){
        Iterator<Product> iteratorItem = productList.iterator();
        while (iteratorItem.hasNext()) {
            Product nextItem = iteratorItem.next();
            if (nextItem.getId().equals(id)) {
                int index = productList.indexOf(nextItem);
                return productList.get(index);
            }
        }
        return null;
    }

    public boolean checkId(int id){
        for(Product p: productList){
            if(p.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public void removeItem(int id){
        Iterator<Product> iteratorItem = productList.iterator();
        while (iteratorItem.hasNext()){
            Product nextItem = iteratorItem.next();
            if(nextItem.getId().equals(id)){
                iteratorItem.remove();
            }
        }
    }

    //сортировка товаров по цене(по возрастанию)
    public void sortProductListByPrice(){
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
    }

    //сортировка товаров по id в обратном порядке
    public void sortProductListonById(){
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getId() == o2.getId()) return 0;
                else if (o1.getId() > o2.getId()) return -1;
                else return 1;
            }
        });
    }

    //редактирование товара
    public void editProduct(int id, Product product, String newProductName, Double newPrice){
        product.setPrice(newPrice);
        product.setProductName(newProductName);
        Iterator<Product> iteratorItem = productList.iterator();
        while (iteratorItem.hasNext()){
            Product nextItem = iteratorItem.next();
            if(nextItem.getId().equals(id)){
                int index = productList.indexOf(product);
                productList.set(index, product);
            }
        }
    }
}









