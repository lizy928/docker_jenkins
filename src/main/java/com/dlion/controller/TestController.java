package com.dlion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @Date 2019/12/6 10:39
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public Object test() {
        return "hello jenkins";
    }

    @GetMapping("/")
    public Object test2() {
        return "welcome jenkins";
    }


}
