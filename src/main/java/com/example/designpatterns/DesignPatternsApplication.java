package com.example.designpatterns;

import com.example.designpatterns.behavioralpatterns.chainofresponsibility.ChainOfResponsibilityClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        Pattern client = new ChainOfResponsibilityClient();
//        Pattern client = new ProxyClient();
//        Pattern client = new FlyweightClient();
//        Pattern client = new FacadeClient();
//        Pattern client = new DecoratorClient();
//        Pattern client = new CompositeClient();
//      Pattern client = new BridgeClient();
//      Pattern client = new AdapterClient();
//		Pattern client = new SingletonClient();
//		Pattern client = new PrototypeClient();
//		Pattern client = new FactoryMethodClient();
//		Pattern client = new AbstractFactoryClient();
//		Pattern client = new BuilderClient();
        client.triggerPattern();

    }
}
