package com.jackson.streamrabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamRabbitmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqConsumerApplication.class, args);
        System.out.println("==> StreamRabbitmqConsumerApplication startup...");
    }

}
