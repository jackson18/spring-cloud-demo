package com.jackson.eurekaconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * ========================================================
 * 日 期：2020/11/21 4:04 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Service
public class ProductClient {

    @Autowired
    private RestTemplate restTemplate;

    public String getProduct() {
        return restTemplate.getForObject("http://EUREKA-PRODUCT-SERVICE/getProduct", String.class);
    }

}
