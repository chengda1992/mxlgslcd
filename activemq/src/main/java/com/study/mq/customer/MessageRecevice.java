package com.study.mq.customer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageRecevice {

    //使用JmsListener配置消费者监听的队列
    @JmsListener(destination = "queue")//目的地
    public void receiveQueueObj(String txtMsg) {
        System.out.println("****************************************接受到消息"+txtMsg);
    }
}
