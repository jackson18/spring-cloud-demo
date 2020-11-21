package com.jackson.hystrix.controller;

import com.jackson.hystrix.client.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================================================
 * 日 期：2020/11/21 11:04 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping("/hystrix")
public class ProductController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @RequestMapping("/getProduct")
    public String getProduct() {
        return productFeignClient.getProduct();
    }

}
