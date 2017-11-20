package controller;

import java.util.Arrays;

import boundary.Gui;
import boundary.Keyboard;
import boundary.Out;
import entity.Die;
import entity.PlayerList;
import entity.squares.GameBoard;
import entity.squares.Territory;
import gamelogic.GameLogic;
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
	private GameLogic gamelogic;
	private Die d1, d2;
	private int playerCount, newPosition;

	
	
	
	public GameController() 
	{
		gui = new Gui();
		out = new Out();
		keyboard = new Keyboard();
		gameboard = new GameBoard();
		rulebook = new RuleBook();
		d1 = new Die();
		d2 = new Die();
		gamelogic = new GameLogic();
		
	}




	public void gameControl() {


		//Welcome messages
		out.welcomeNew();
		playerCount = keyboard.getIntRange(2, 4);
//		out.endCurrentOutput();
		out.setAmountPlayers(playerCount);
		out.playerCount(playerCount);


		//make the names array as long as the number of players.
		names = new String[playerCount];



		//Ask for player names.
		askForNames();

		
		playerList = new PlayerList(playerCount, names, rulebook.startMoney(playerCount));


		//Summary the players.
		playerSummary(names);
		out.endEntry();



		//setting up the gui
		gui.defineGUI(gameboard);
		gui.setNames(playerList);


		
		
		//Now we just need to put in all the game code here. Remember: logic code needs to be in the gamelogic package!!!
		
		
		//Calculates the new position for the player.
		newPosition = gamelogic.newPosition(playerList.getSpecificPlayer(0).getPosition(), playerList.getSpecificPlayer(0).rollDice(d1, d2), gameboard.getSize());
		playerList.getSpecificPlayer(0).setPosition(1);
		

		
		//get the current field on the gameboard, based on the player position
		rulebook.playerLands(gameboard, playerList.getSpecificPlayer(0), playerList, out);
		
		if (gameboard.getField(playerList.getSpecificPlayer(0).getPosition()).getClass() == gameboard.getField(1).getClass()) {
			territorySituation();
			
		}
		System.out.println(((Territory)gameboard.getField(playerList.getSpecificPlayer(0).getPosition())).getOwner());
			
		










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
	
		}
		
		
		
		


		
		
		
		//make the playerlist as long as the number of players, and give them the name, that was inputtet.

	}


	
	public void territorySituation() {
		int answer;
		answer = keyboard.getIntRange(4, 5);

		if (answer == 4) {
			((Territory)gameboard.getField(playerList.getSpecificPlayer(0).getPosition())).setOwner(playerList.getSpecificPlayer(0).getName());
			((Territory)gameboard.getField(playerList.getSpecificPlayer(0).getPosition())).setOwned(true);
		} else {
			//print message for not buying.
		}
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
