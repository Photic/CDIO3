package controller;

import java.util.Arrays;

import boundary.Gui;
import boundary.Keyboard;
import boundary.Out;
import entity.PlayerList;
import entity.squares.GameBoard;
import gamelogic.RuleBook;

public class GameController {

	private Out out;
	private Gui gui;
	private Keyboard keyboard;
	private PlayerList playerList;
	private String currentName;
	private String[] names;
	private GameBoard gameboard;
	private RuleBook rulebook;
	private int playerCount;

	public GameController() 
	{
		gui = new Gui();
		out = new Out();
		keyboard = new Keyboard();
		gameboard = new GameBoard();
		rulebook = new RuleBook();
		
	}




	public void gameControl() {


		//Welcome messages
		out.welcomeNew();
		playerCount = keyboard.getIntRange(2, 4);
		out.endCurrentOutput();
		out.setAmountPlayers(playerCount);
		out.playerCount(playerCount);


		//make the names array as long as the number of players.
		names = new String[playerCount];



		//Ask for player names.
		askForNames();




		//Summary the players.
		playerSummary(names);




		//setting up the gui
		gui.defineGUI(gameboard);
		gui.setNames(playerList);


		
		
		//Now we just need to put in all the game code here. Remember: logic code needs to be in the gamelogic package!!!
		
		
		
		
		
		


		










	}



	private void playerSummary(String[] names) {
		//Summary on the players participating
		out.printPlayerSummary(names);// Player names
	}

	
	/**
	 * This method asks for players names, and adds iditifiers if the names are the same.
	 * 
	 * @author Mathias
	 */
	private void askForNames() {
		for (int i = 0; i<playerCount; i++) {
			out.askForName(i+1);
			do {currentName = keyboard.getString();
			}
			while (currentName.length()==0);

			
			if (!(Arrays.asList(names).contains(currentName))) {
				names[i] = currentName;
			} else {
				int count = 2;
				while(true) {
					if (!(Arrays.asList(names).contains(currentName + "_" + count))) {
						names[i] = currentName + "_" + count;
						break;
					}
					count++;
					if(count == 7) {
						break;
					}
				}
			}
			out.printName(i+1, currentName);
		}
		
		
		
		


		
		
		
		//make the playerlist as long as the number of players, and give them the name, that was inputtet.
		playerList = new PlayerList(playerCount, names);
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
