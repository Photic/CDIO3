package gamelogic;

import boundary.Out;
import entity.Player;
import entity.PlayerList;
import entity.squares.GameBoard;

public class RuleBook {
	
	/**
	 * This method that determines how much money the players will recieve at the beginning of the game, based on the number of players. 
	 * @param playercount
	 * The amount of people playing the game. 
	 * @return
	 * Returns an integer descriping how much money each player will start with. 
	 * 
	 */
	public int startMoney(int playercount) 
	{	
		int out;
		
		switch(playercount)
		{
		case 2:
			out= 20;
			break;
		case 3:
			out= 18;
			break;
		case 4:
			out= 16;
			break;
		default:
			out = 20;
			break;
		}
		return out;
	}
	
	/**
	 * Check if the player has passed start, based on the number of squares walked.
	 * @param player
	 * The player.
	 * @param gameboard
	 * The gameboard
	 * @return
	 * True if the player has passed, false if not.
	 */
	public boolean checkIfPassedStart(Player player, GameBoard gameboard) {
		if (player.getWalkedSquares() > gameboard.getSize()) {
			player.setWalkedSquares(player.getWalkedSquares() - gameboard.getSize());
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Used to evalute the logic through the abstract method whatToDoOnSquare().
	 * @param gameboard
	 * @param player
	 * @param playerlist
	 * @param out
	 */
	public void playerLands(GameBoard gameboard, Player player, PlayerList playerlist, Out out)
	{
		gameboard.getField(player.getPosition()).squareLogic(player, playerlist, out, null);
	}
	
	
	
}
