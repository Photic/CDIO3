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
	private int playerCount, newPosition, diceSum;




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



		//setting up the gui
		gui.defineGUI(gameboard);
		gui.setNames(playerList);
		//

		while(true) 
		{
			// If there is only 1 player left, the winner is announced.
			if (playerList.getLength() == 1)
			{
				out.announceWinner(playerList.getSpecificPlayer(0));
				break;
				// Lister remove player
			}



			//Now we just need to put in all the game code here. Remember: logic code needs to be in the gamelogic package!!!
			for (int i = 0; i<playerList.getLength(); i++) {

				//First check if the player is in jail.
				if(playerList.getSpecificPlayer(i).isDead() == true) {

				}
				else if(playerList.getSpecificPlayer(i).isInJail()) {
					playerList.getSpecificPlayer(i).setInJail(false);
					// tilføj remove money fra player
				} else {

					//Wait for the player to press 5 to roll the dice.
					out.wantToRoll(playerList.getSpecificPlayer(i));
					keyboard.waitForInt(5);


					// ændre rolldice til gamecontroller
					diceSum = playerList.getSpecificPlayer(i).rollDice(); 
					gui.setDice(playerList.getSpecificPlayer(i).getD1(), playerList.getSpecificPlayer(i).getD2());
					out.evaluateDice(playerList.getSpecificPlayer(i).getName(), diceSum);

					//Calculates the new position for the player.
					newPosition = gamelogic.newPosition(playerList.getSpecificPlayer(i).getPosition(), diceSum, gameboard.getSize());
					out.evaluateNewPos(newPosition, gameboard);

					playerList.getSpecificPlayer(i).setPosition(newPosition);


					//get the current field on the gameboard, based on the player position
					rulebook.playerLands(gameboard, playerList.getSpecificPlayer(i), playerList, out);

					
					
					//HVIS TID - SMID I EN METODE 
					//If it is a territory field
					if (gameboard.getField(playerList.getSpecificPlayer(i).getPosition()).getClass() == gameboard.getField(1).getClass()) 
					{
						if (((Territory)gameboard.getField(playerList.getSpecificPlayer(i).getPosition())).getOwner().length() <= 0) 
						{
							territorySituation(i);	
						}

					}

					//Update the balance of the players on the gui.
					for (int j = 0; j<playerList.getLength(); j++) {
						gui.updateBalance(playerList.getSpecificPlayer(j));
					}

					//Check if the current player died.
					gamelogic.checkIfDead(playerList.getSpecificPlayer(i), playerList);
					
					//Remove all dead players.
					if (playerList.getSpecificPlayer(i).isDead() == true)
					{
						playerList.removePlayerIfDead(playerList.getSpecificPlayer(i), playerList);
					}
					

				}
			}
		}





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


	/**
	 * This method checks if the player wants to buy a free territory.
	 * @param i
	 * the current iterations variable, to determine player.
	 */
	public void territorySituation(int i) 
	{
		int answer = keyboard.getIntRange(0, 1);

		if (answer == 1) {
			((Territory)gameboard.getField(playerList.getSpecificPlayer(i).getPosition())).setOwner(playerList.getSpecificPlayer(i).getName());
			((Territory)gameboard.getField(playerList.getSpecificPlayer(i).getPosition())).setOwned(true);
			out.playerNowOwns(playerList.getSpecificPlayer(i), gameboard);
			playerList.getSpecificPlayer(i).setBalance(playerList.getSpecificPlayer(i).getBalance() - ((Territory)gameboard.getField(playerList.getSpecificPlayer(i).getPosition())).getPrice());
		} else {
			out.notBuying();
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
