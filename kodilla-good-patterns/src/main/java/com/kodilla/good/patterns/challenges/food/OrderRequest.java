package com.kodilla.good.patterns.challenges.food;

import java.util.List;

public class OrderRequest {
    private List<Product> products;
    private Product product;

    public OrderRequest(List<Product> products, Product product) {
        this.products = products;
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct() {
        return product;
    }
}
