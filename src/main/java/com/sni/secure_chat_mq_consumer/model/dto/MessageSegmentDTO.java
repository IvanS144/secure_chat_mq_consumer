package com.sni.secure_chat_mq_consumer.model.dto;

import lombok.Data;

@Data
public class MessageSegmentDTO {
    private String messageId;
    private Integer segmentNo;
    private Integer totalSegments;
    private String content;
    private Integer senderId;
    private Integer recipientId;
}
