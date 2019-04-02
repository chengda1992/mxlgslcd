package com.study.zookeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * kafka消息产生者
 */
@RestController
public class KafkaSentController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * 发送消息到kafka
     */
    @RequestMapping("/kafka")
    public void sendChannelMess(String message){
        kafkaTemplate.send("Topic",message);
    }



}
