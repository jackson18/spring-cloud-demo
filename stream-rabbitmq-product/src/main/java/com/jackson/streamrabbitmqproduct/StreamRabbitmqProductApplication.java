package com.jackson.streamrabbitmqproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamRabbitmqProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqProductApplication.class, args);
        System.out.println("==> StreamRabbitmqProductApplication startup...");
    }

}
