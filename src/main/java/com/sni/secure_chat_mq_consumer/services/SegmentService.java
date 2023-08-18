package com.sni.secure_chat_mq_consumer.services;

import com.sni.secure_chat_mq_consumer.model.dto.MessageSegmentDTO;

public interface SegmentService {
    void persist(MessageSegmentDTO segmentDTO);
}
