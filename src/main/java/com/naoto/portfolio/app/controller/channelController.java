package com.naoto.portfolio.app.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.naoto.portfolio.app.service.ChannelService;
import com.naoto.portfolio.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller

public class channelController {

    private final ChannelService channelService;

    @PostMapping("/create")
    public String create(@Valid Channel channel,BindingResult result, Model model){
        if(result.hasErrors()){
            List<Channel> channels = channelService.findAll();
            model.addAttribute("channels", channels);
            model.addAttribute("channel", channel);
            return "channels/index";
        }
        channelService.create(channel);
        return "redirect:/";
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Channel> channels = channelService.findAll();
        model.addAttribute("channels", channels);
        model.addAttribute("channel", new Channel());
        return "channels/index";
    }

    @PutMapping("/{id}")
    public Channel update(@PathVariable("id") int id, @RequestBody Channel channel) {
        return channelService.update(channel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        channelService.delete(id);
    }
    
}
