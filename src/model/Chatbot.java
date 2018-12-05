package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	private String currentUser;
	private String joke;
	private String content;
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;

	public Chatbot()
	{
		this.joke = "THANOS CAR THANOS CAR";
		this.currentUser = new String("default user - EPICC!!!");
		this.content = new String("BOTTOM TEXT");

		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
	}

	
	
	public Chatbot(String content)
	{
		this.content = content;
	}

	
	
	//method that tells the program when to stop running
	public void start()
	{
		String userInput = "";

		while (!userInput.equalsIgnoreCase("quit"))
		{
			// userInput = interactWithChatBot(String text)
		}
	}

	public String interactWithChatBot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null, "Hi, what do you want to talk about");
		// String chatbotSays = simpleBot.processText(userInput);
		return "";
	}

	private void buildTheLists()
	{
		responseList.add("hello! HOw are yoU?");
		responseList.add("Goodbye - no more talking!");
		spookyList.add("BOO!");
		responseList.add("Have you ever committed Tax Fraud????");
		spookyList.add("Just committed tax fraud, VICTORY ROYALE ");
		spookyList.add("OH NOOO A CREEPER!! I STILL SEE YOUR SHADOWS IN MY ROOM");
	}

	public String processText(String userText)
	{
		String output = "";

		output += "You said: " + userText;
		return output;
	}

	public String askName()
	{
		String name = "";
		return name;
	}

	// getters and setters

	public ArrayList<String> getResponseList()
	{
		return this.responseList;
	}

	public ArrayList<String> getSpookyList()
	{
		return this.spookyList;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{

	}

	public String getCurrentUser()
	{
		return this.currentUser;
	}

	public void setCurrentUser(String currentUser)
	{

	}

	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if (input == null)
		{
			isValid = false;
		}
		else if (input.length() < 1)
		{
			isValid = false;
		}
		else if (input.contains("dfg") || input.contains("cvb"))
		{
			isValid = false;
		}
		return isValid;
	}

	public boolean spookyChecker(String string)
	{

		return false;
	}

}
