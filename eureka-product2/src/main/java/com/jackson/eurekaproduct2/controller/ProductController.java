package com.jackson.eurekaproduct2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ========================================================
 * 日 期：2020/11/21 11:33 上午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
public class ProductController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getProduct")
    public String getProduct() {
        List<String> productList = new ArrayList<>();
        productList.add("apple");
        productList.add("orange");
        productList.add("tea");
        productList.add("serverPort: " + port);
        return String.join(",", productList);
    }

}
