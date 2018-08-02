package com.kodilla.good.patterns.challenges.food;


public class OrderMain {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new ExtraFoodShop(orderRequest.getProducts()));
        orderProcessor.process(orderRequest);
    }
}
