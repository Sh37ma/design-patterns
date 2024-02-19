package com.example.designpatterns.structuralpatterns.decorator;

public class EmailNotificationDecorator extends DeliveryDecorator {

    public EmailNotificationDecorator(Delivery deliveryDecorator) {
        super(deliveryDecorator);
    }

    @Override
    public void deliver() {
        wrappee.deliver();
        System.out.println("Email notif was sent");
    }
}
