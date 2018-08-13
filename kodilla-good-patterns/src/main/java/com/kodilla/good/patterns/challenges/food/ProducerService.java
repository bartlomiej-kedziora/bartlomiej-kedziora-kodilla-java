package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public interface ProducerService {
    boolean process(Map<Product, Integer> productsToOrder);

    Map<Product, Integer> getOrderedProducts();
}
