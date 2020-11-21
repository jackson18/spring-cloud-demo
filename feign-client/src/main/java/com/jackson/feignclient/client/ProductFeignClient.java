package com.jackson.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ========================================================
 * 日 期：2020/11/21 6:49 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
@FeignClient(value = "EUREKA-PRODUCT-SERVICE")
public interface ProductFeignClient {

    @GetMapping(value = "/getProduct")
    public String getProduct();

}
