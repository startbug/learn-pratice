package com.ggs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lianghaohui
 * @Date 2022/5/18 13:16
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/mytest1")
    public String mytest1(@RequestParam("myName") String myName) {
        log.info("myName:{}", myName);
        redisTemplate.opsForValue().set("learn-pratice:myName", myName);
        return "OK";
    }

}
