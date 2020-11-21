package com.jackson.hystrix.client;

import org.springframework.stereotype.Component;

/**
 * ========================================================
 * 日 期：2020/11/21 11:00 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
public class ProductFeignClientFallBack implements ProductFeignClient {

    @Override
    public String getProduct() {
        return "service can not normal use!";
    }

}
