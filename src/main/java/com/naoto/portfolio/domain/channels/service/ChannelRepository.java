package com.naoto.portfolio.domain.channels.service;

import java.util.List;
import java.util.Optional;

import com.naoto.portfolio.domain.channels.model.Channel;

public interface ChannelRepository {

    void insert(Channel channel);
    List<Channel> findAll();
    Optional <Integer> getMaxId();
    int update(Channel channel);
    int delete(int id);
}
