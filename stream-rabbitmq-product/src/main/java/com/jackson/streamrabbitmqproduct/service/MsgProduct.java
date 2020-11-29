package com.jackson.streamrabbitmqproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * ========================================================
 * 日 期：2020/11/29 4:43 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
public class MsgProduct {

    @Autowired
    private StreamBridge streamBridge;

    public String send() {
        String uuid = UUID.randomUUID().toString();
        streamBridge.send("MyTopic", uuid);
        System.out.println("==> output send msg: " + uuid);
        return uuid;
    }

}
