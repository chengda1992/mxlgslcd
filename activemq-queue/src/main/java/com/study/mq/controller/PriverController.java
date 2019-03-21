package com.study.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息产生者
 */
@RestController
public class PriverController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/test")
    public String test1(String msg){
        jmsMessagingTemplate.convertAndSend("queue",msg);
        return "消息已经发送";
    }



}
