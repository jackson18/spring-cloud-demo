package com.jackson.eurekaproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProductApplication.class, args);
        System.out.println("==> EurekaProductApplication startup...");
    }

}
