package com.study.zookeeper.bean;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    /**
     * 监听Topic主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"Topic"})
    public void receiveMessage(String message){
        //收到通道的消息之后执行秒杀操作
        System.out.println(message);
    }
}
