package com.example.designpatterns.factorymethod;

public abstract class Logistic {
    protected abstract Transport createTransport();

    public void startTransporting(){
        Transport transport = createTransport();
        System.out.println("Delivery started...");
        transport.deliver();
        System.out.println("Delivery ended...");
    }

}
