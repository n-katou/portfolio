package com.naoto.portfolio.infrastructure.messages;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.naoto.portfolio.domain.messages.model.Message;
import com.naoto.portfolio.domain.messages.service.MessageRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor

public class MyBatisMessageRepository implements MessageRepository {

    private final MessageMapper messageMapper;

    @Override
    public void insert(Message message) {
        
        messageMapper.insert(message);
        
    }

    @Override
    public List<Message> find(int channelId, Optional<String> searchWord) {
        
        return messageMapper.find(channelId, searchWord);
    }
    
}
