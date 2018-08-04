package com.kodilla.good.patterns.challenges.food;


public class OrderProcessor {
    private ProducerService producerService;

    public OrderProcessor(ProducerService producerService) {
        this.producerService = producerService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = producerService.process(orderRequest.getProductsToOrder());
        if(isOrdered) {
            return new OrderDto(producerService.getOrderedProducts(), true);
        } else {
            return new OrderDto(producerService.getOrderedProducts(), false);
        }
    }
}
