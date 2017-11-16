package controller;

import boundary.Gui;
import boundary.Keyboard;
import boundary.Out;

public class GameController {
	
	private Out out;
	private Gui gui;
	private Keyboard keyboard;
	private int playerCount;
	
	public GameController() 
	{
		gui = new Gui();
		out = new Out();
		keyboard = new Keyboard();
	}
	
	
	
	
	public void gameControl() {
		
		out.welcomeNew();
		out.howManyPlayers();
		playerCount = keyboard.getIntRange(2, 6);
		out.playerCount(playerCount);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public Gui getGui() 
	{
		return gui;
	}

	public void setGui(Gui gui) 
	{
		this.gui = gui;
	}
		
}
