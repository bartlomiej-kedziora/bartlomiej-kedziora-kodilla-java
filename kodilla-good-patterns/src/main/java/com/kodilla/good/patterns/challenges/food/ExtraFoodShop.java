package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements ProducerService {
    private Map<Product, Integer> productsInStock;
    private Map<Product, Integer> orderedProducts;

    public ExtraFoodShop(Map<Product, Integer> productsInStock) {
        this.productsInStock = productsInStock;
        this.orderedProducts = new HashMap<>();
    }

    @Override
    public boolean process(Map<Product, Integer> productsToOrder) {
        productsToOrder.entrySet().stream()
                .filter(entity -> productsInStock.containsKey(entity.getKey()))
                .filter(entity -> productsInStock.get(entity.getKey()) >= entity.getValue())
                .forEach(entity ->
                {
                    orderedProducts.put(entity.getKey(), entity.getValue());
                    productsInStock.computeIfPresent(entity.getKey(), (k,v) -> v - entity.getValue());
                });

        if(orderedProducts.size() > 0) {
            System.out.println("You ordered:");
            orderedProducts.entrySet().stream()
                    .forEach(System.out::println);
            return true;
        }
        return false;
    }

    @Override
    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }
}
