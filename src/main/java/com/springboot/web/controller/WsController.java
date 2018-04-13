package com.springboot.web.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.springboot.web.domain.SocketMessage;
import com.springboot.web.domain.SocketResponse;

@Controller
public class WsController {
	
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public SocketResponse say(SocketMessage message) throws Exception{
		Thread.sleep(500);
		return new SocketResponse("Welcome,"+message.getName()+"!");
	}

}
