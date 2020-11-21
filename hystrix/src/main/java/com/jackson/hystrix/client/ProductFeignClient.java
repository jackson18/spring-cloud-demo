package com.jackson.hystrix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ========================================================
 * 日 期：2020/11/21 10:58 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
@FeignClient(value = "EUREKA-PRODUCT-SERVICE", fallback = ProductFeignClientFallBack.class)
public interface ProductFeignClient {

    @GetMapping(value = "/getProduct")
    String getProduct();

}
