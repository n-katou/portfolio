package com.naoto.portfolio.infrastructure.messages;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.naoto.portfolio.domain.messages.model.Message;

@Mapper
public interface MessageMapper {
    void insert(Message message);

    List<Message> find(@Param("channelId") int channelId, @Param("searchWord") Optional<String> searchWord);

    int delete(int id);
}
