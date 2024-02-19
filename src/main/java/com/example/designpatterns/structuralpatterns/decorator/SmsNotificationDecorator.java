package com.example.designpatterns.structuralpatterns.decorator;

public class SmsNotificationDecorator extends DeliveryDecorator {

    public SmsNotificationDecorator(Delivery wrappee) {
        super(wrappee);
    }

    @Override
    public void deliver() {
        wrappee.deliver();
        System.out.println("SMS notif was sent");
    }
}
