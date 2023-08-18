package com.sni.secure_chat_mq_consumer.mq;

import com.sni.secure_chat_mq_consumer.model.dto.MessageSegmentDTO;
import com.sni.secure_chat_mq_consumer.services.SegmentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MQConsumer {
    private final String queueName;

    private final SegmentService segmentService;

    public MQConsumer(@Value("${queue.name}") String queueName, SegmentService segmentService) {
        this.queueName = queueName;
        this.segmentService = segmentService;
    }

    @RabbitListener(queues = {"${queue.name}"})
    public void consumeMessage(MessageSegmentDTO segmentDTO){
        segmentService.persist(segmentDTO);
    }
}
