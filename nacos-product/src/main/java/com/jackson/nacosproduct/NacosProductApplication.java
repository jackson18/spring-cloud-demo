package com.jackson.nacosproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1.下载nacos1.3.1
 *  *
 *  * 2.启动nacos服务
 *  * Linux/Unix/Mac
 *  * 启动命令(standalone代表着单机模式运行，非集群模式):
 *  *
 *  * sh startup.sh -m standalone
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProductApplication.class, args);
        System.out.println("==> NacosProductApplication startup... ");
    }

    @RestController
    static class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return string;
        }
    }

}
