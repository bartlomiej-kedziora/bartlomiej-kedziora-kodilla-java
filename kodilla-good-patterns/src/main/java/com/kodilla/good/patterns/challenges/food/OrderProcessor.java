package com.kodilla.good.patterns.challenges.food;


public class OrderProcessor {
    private ProducerService producerService;

    public OrderProcessor(ProducerService producerService) {
        this.producerService = producerService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = producerService.process(orderRequest.getProduct());
        if(isOrdered) {
            return new OrderDto(orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), false);
        }
    }
}
