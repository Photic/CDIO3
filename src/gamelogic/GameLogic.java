package gamelogic;

import entity.Player;
import entity.PlayerList;

public class GameLogic {


	private final int DEATH_POINT = 0;

	/**
	 * This methods makes sure that the player goes in circles on the gameboard.
	 * @param currentField
	 * An integer descriping the current field location
	 * @param faceValues
	 * Sum of the die facevalues
	 * @param fieldCount
	 * Total amount of fields.
	 * @return
	 * Returns an integer descriping the new field location.
	 * 
	 */
	public int newPosition(int currentField, int faceValues, int fieldCount) {
		if (currentField+faceValues >= fieldCount)
			return (currentField+faceValues)-fieldCount;

		return currentField+faceValues;
	}


	/**
	 * Checks if a player dies.
	 * @param newMoney
	 * The new money.
	 * @param player
	 * the player
	 * @param playerlist TODO
	 * 
	 */
	public void checkIfDead(Player player, PlayerList playerlist) 
	{
		if (player.getBalance() <= DEATH_POINT) {
			player.setDead(true);
		}
	}	
}
