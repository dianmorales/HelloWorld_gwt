package com.google.gwt.sample.server;

import com.google.gwt.sample.client.Message;
import com.google.gwt.sample.client.MessageService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MessageServiceImpl extends RemoteServiceServlet implements MessageService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Message getMessage(String input) {
		String messageString = "Hello" + input + "!";
		Message message = new Message();
		message.setMessage(messageString);
		return message;
	}  
}
