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
		
	}
	
	public Chatbot(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public String askName()
	{
		String name = "";
		return name;
	}
	
	//getters and setters
	
	public String getCurrentUser(String currentUser)
	{
		return this.currentUser;
	}
	
	public String setCurrentUser(String currentUser)
	{
		return this.currentUser;
	}
	
	
}
