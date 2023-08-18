package com.sni.secure_chat_mq_consumer.repositories;

import com.sni.secure_chat_mq_consumer.model.dto.MessageSegmentDTO;
import com.sni.secure_chat_mq_consumer.model.entities.Segment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SegmentRepository extends JpaRepository<Segment, Integer> {
}
