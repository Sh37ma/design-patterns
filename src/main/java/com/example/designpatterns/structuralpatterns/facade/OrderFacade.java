package com.example.designpatterns.structuralpatterns.facade;

import com.example.designpatterns.structuralpatterns.facade.externalorderservices.DeliveryService;
import com.example.designpatterns.structuralpatterns.facade.externalorderservices.PackageService;
import com.example.designpatterns.structuralpatterns.facade.externalorderservices.PaymentService;

public class OrderFacade {

    private final DeliveryService deliveryService;
    private final PackageService packageService;
    private final PaymentService paymentService;

    public OrderFacade() {
        deliveryService = new DeliveryService();
        packageService = new PackageService();
        paymentService = new PaymentService();
    }

    public void placeOrder() {
        System.out.println("Starting process of completing order");
        paymentService.doAction();
        packageService.doAction();
        deliveryService.doAction();
    }
}
