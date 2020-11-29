package com.jackson.streamrabbitmqconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamRabbitmqConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqConsumer2Application.class, args);
        System.out.println("==> StreamRabbitmqConsumer2Application startup...");
    }

}
