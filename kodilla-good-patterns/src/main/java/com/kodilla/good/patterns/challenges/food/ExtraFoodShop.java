package com.kodilla.good.patterns.challenges.food;

import java.util.List;

public class ExtraFoodShop implements ProducerService {
    List<Product> products;

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean process(Product product) {
        int indexInList = products.indexOf(product);
        Product productFromList = products.get(indexInList);
        int newQuantityAfterOrder = products.get(indexInList).getQuantity() - product.getQuantity();

        if(productFromList.equals(product) && newQuantityAfterOrder >=0) {
            productFromList.setQuantity(newQuantityAfterOrder);
            System.out.println("Your product: " + product.getName() + " is ordered");
            return true;
        }
        return false;
    }
}
