package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/getBalance")
    public String getBalance() {
        return String.valueOf(testService.getTest().getBalance());
    }


}
