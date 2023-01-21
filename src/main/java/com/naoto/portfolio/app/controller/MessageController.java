package com.naoto.portfolio.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naoto.portfolio.app.service.MessageService;
import com.naoto.portfolio.domain.messages.model.Message;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/channels/{channelId}/messages")
@RequiredArgsConstructor

public class MessageController {

    private final MessageService messageService;
    
    @GetMapping
        public List<Message> find(
        @RequestParam("channelId") int channelId,
        @RequestParam("searchWord") Optional<String> searchWord) {
        return messageService.find(channelId, searchWord);
  }

    @PostMapping
    public Message post(@RequestBody Message message) {
        return messageService.post(message);
    }
}
