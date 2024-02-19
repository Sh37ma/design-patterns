package com.example.designpatterns.structuralpatterns.decorator;

import com.example.designpatterns.Pattern;

public class DecoratorClient implements Pattern {
    @Override
    public void triggerPattern() {
        DeliverySystem deliverySystem = new DeliverySystem("New York 123");
        DeliveryDecorator deliveryDecorator = new DeliveryDecorator(deliverySystem);
        EmailNotificationDecorator emailNotificationDecorator = new EmailNotificationDecorator(deliveryDecorator);
        SmsNotificationDecorator smsNotificationDecorator = new SmsNotificationDecorator(emailNotificationDecorator);

        smsNotificationDecorator.deliver();
    }
}
