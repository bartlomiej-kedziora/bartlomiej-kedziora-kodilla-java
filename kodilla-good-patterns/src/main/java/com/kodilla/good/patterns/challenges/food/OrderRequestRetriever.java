package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("milk", 10));
        products.add(new Product("cola", 5));

        Product product = new Product("milk", 5);

        return new OrderRequest(products, product);
    }
}
