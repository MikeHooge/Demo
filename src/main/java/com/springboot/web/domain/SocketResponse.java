package com.springboot.web.domain;

public class SocketResponse {
	private String ResponseMessage;

	public String getResponseMessage() {
		return ResponseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		ResponseMessage = responseMessage;
	}

	public SocketResponse(String responseMessage) {
		ResponseMessage = responseMessage;
	}
	

}
