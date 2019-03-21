package com.study.demo.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 订阅模式消费者
 */
@Component
public class TopicCustomer {
    /**
     * 创建2个消费者
     * @param text
     */
    @JmsListener(destination = "topic-my")
    public void subscriber(String text) {
        System.out.println("消费者1111111111111111111111消费+"+text);
    }

    @JmsListener(destination = "topic-my")
    public void subscriber1(String text) {
        System.out.println("消费者2222222222222222222222消费+"+text);
    }

}
