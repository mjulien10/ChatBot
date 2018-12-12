package controller;

import javax.swing.JOptionPane;

import model.Chatbot;

public class ChatController
{
	
	private Chatbot Chatbot;
	
	ChatController()
	{
		
		Chatbot = new Chatbot();
	}

	public void start()
	{
		
	}

	public String interactWithChatbot(String botText)
	{
		String x = "";
		return x;
	}
	
	public void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(ChatFrame, error.getMessage());
	}
	
	
}
