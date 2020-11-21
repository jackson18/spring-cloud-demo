package com.jackson.feignclient.controller;

import com.jackson.feignclient.client.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================================================
 * 日 期：2020/11/21 6:51 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @RequestMapping("/getProduct")
    public String getProduct() {
        return productFeignClient.getProduct();
    }

}
