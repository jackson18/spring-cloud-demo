package com.jackson.streamrabbitmqproduct.controller;

import com.jackson.streamrabbitmqproduct.service.MsgProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ========================================================
 * 日 期：2020/11/29 4:44 下午
 * 作 者：jiabinqi
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
@RestController
public class SendMsgController {

    @Resource
    private MsgProduct msgProduct;

    @GetMapping("/sendMsg")
    public String sendMsg() {
        return msgProduct.send();
    }
}
