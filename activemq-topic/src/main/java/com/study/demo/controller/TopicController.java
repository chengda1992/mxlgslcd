package com.study.demo.controller;

import com.study.demo.activemq.TopicProducter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订阅模式生产者
 */
@RestController
public class TopicController {

    @Autowired
    private TopicProducter topicProducter;

    @RequestMapping("/publish")
    public String publish(String msg){
        topicProducter.sendMessage(msg);
        return "消息已经发布";
    }

}
