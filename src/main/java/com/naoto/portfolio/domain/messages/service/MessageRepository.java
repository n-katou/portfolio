package com.naoto.portfolio.domain.messages.service;

import java.util.List;
import java.util.Optional;

import com.naoto.portfolio.domain.messages.model.Message;

public interface MessageRepository {
    
    void insert(Message message);
    List<Message> find(int channelId, Optional<String> searchWord);
}
