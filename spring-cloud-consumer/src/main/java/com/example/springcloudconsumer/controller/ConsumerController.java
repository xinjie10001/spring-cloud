package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangxinjie
 * @Date: 2018/8/20 15:16
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    public HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}