package com.jackson.eurekaproduct2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProduct2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProduct2Application.class, args);
        System.out.println("==> EurekaProduct2Application startup...");
    }

}
