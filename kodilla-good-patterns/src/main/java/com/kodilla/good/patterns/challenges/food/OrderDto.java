package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public class OrderDto {
    private Map<Product, Integer> orderedProducts;
    private boolean isOrdered;

    public OrderDto(Map<Product, Integer> orderedProducts, boolean isOrdered) {
        this.orderedProducts = orderedProducts;
        this.isOrdered = isOrdered;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
