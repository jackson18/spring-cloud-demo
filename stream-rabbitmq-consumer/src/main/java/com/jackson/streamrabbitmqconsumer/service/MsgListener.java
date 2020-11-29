package com.jackson.streamrabbitmqconsumer.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

/**
 * ========================================================
 * 日 期：2020/11/29 4:50 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Configuration
public class MsgListener {

    @Bean
    public Consumer<Message<String>> subscribeMyTopic() {
        return message -> System.out.println("Payload: " + message.getPayload());
    }

}
