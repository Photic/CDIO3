package controller;

import boundary.Gui;
import boundary.Keyboard;
import boundary.Out;
import entity.PlayerList;

public class GameController {

	private Out out;
	private Gui gui;
	private Keyboard keyboard;
	private PlayerList playerList;
	private String currentName;
	private String[] names;
	private int playerCount;

	public GameController() 
	{
		gui = new Gui();
		out = new Out();
		keyboard = new Keyboard();
	}




	public void gameControl() {


		//Welcome messages
		out.welcomeNew();
		out.howManyPlayers();
		playerCount = keyboard.getIntRange(2, 6);
		out.playerCount(playerCount);



		//Ask for player names
		names = new String[playerCount];
		for (int i = 0; i<playerCount; i++) {
		out.askForName();
		do {currentName = keyboard.getString();
		}
		while (currentName.length()==0);
		
		
		out.printName(i+1, currentName);
		}



		//Using the inputted int to define how many players to create in the player list. 2-6.
		//playerList = new PlayerList(playerCount);








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
