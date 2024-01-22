package com.example.designpatterns;

import com.example.designpatterns.builder.BuilderClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {

		BuilderClient builderClient = new BuilderClient();
		builderClient.triggerPattern();

//		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
