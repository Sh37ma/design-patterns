package com.example.designpatterns;

import com.example.designpatterns.abstractfactory.AbstractFactoryClient;
import com.example.designpatterns.builder.BuilderClient;
import com.example.designpatterns.factorymethod.FactoryMethodClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {

		Pattern client = new FactoryMethodClient();
//		Pattern client = new AbstractFactoryClient();
//		Pattern client = new BuilderClient();
		client.triggerPattern();

//		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
