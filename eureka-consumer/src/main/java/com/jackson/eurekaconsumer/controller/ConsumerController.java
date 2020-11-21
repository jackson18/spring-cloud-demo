package com.jackson.eurekaconsumer.controller;

import com.jackson.eurekaconsumer.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================================================
 * 日 期：2020/11/21 4:01 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProductClient productClient;

    @RequestMapping("/getProduct")
    public String getProduct() {
        return productClient.getProduct();
    }

}
