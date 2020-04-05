package com.gr.mmlive.controller;

import com.gr.mmlive.pojo.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020/4/3 10:12 下午
 */
@Controller
public class ChatController {
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        return chatMessage;
    }
}
