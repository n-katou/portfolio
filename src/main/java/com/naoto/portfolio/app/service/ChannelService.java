package com.naoto.portfolio.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naoto.portfolio.domain.channels.model.Channel;
import com.naoto.portfolio.domain.channels.service.ChannelDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor

public class ChannelService {

    private final ChannelDomainService channelDomainService;

    public Channel create(Channel channel) {
        return channelDomainService.create(channel);
    }

    public List<Channel> findAll(){
        return channelDomainService.findAll();
        
    }

    public Channel update(Channel channel) {
        return channelDomainService.update(channel);
    }

    public void delete(int id){
        channelDomainService.delete(id);
    }

    public Optional<Channel> findById(Integer id) {
        return channelDomainService.findById(id);
    }
}
