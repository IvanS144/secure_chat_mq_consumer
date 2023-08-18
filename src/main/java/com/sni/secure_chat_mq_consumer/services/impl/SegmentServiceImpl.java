package com.sni.secure_chat_mq_consumer.services.impl;

import com.sni.secure_chat_mq_consumer.model.dto.MessageSegmentDTO;
import com.sni.secure_chat_mq_consumer.model.entities.Segment;
import com.sni.secure_chat_mq_consumer.repositories.SegmentRepository;
import com.sni.secure_chat_mq_consumer.services.SegmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SegmentServiceImpl implements SegmentService {
    private final SegmentRepository segmentRepository;
    private final ModelMapper modelMapper;

    public SegmentServiceImpl(SegmentRepository segmentRepository, ModelMapper modelMapper) {
        this.segmentRepository = segmentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void persist(MessageSegmentDTO segmentDTO) {
        Segment segment = modelMapper.map(segmentDTO, Segment.class);
        segmentRepository.saveAndFlush(segment);

    }
}
