package com.kodilla.good.patterns.challenges.food;

public class OrderDto {
    private Product product;
    private boolean isOrdered;

    public OrderDto(Product product, boolean isOrdered) {
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
