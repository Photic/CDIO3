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
		out.printLine();
		out.printStraigthLine();


		//make the names array as long as the number of players.
		names = new String[playerCount];
		
		
		
		//Ask for player names.
		for (int i = 0; i<playerCount; i++) {
		out.askForName(i+1);
		do {currentName = keyboard.getString();
		}
		while (currentName.length()==0);
		
		names[i] = currentName;
		out.printName(i+1, currentName);
		out.printLine();
		}

		
		//make the playerlist as long as the number of players, and give them the name, that was inputtet.
		playerList = new PlayerList(playerCount, names);
		
		
		
		//Summary on the players participating
		out.printStraigthLine();
		out.printLine();
		
		out.printPlayerSummary(names);
		
		out.printLine();
		out.printStraigthLine();
		
		
		
		
		//Now we just need to put in all the game code here. Remember: logic code needs to be in the gamelogic package!!!
		
		
		
		
		
		








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
