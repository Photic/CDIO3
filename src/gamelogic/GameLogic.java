package gamelogic;

import entity.Player;

public class GameLogic {

	
	private static final int DEATH_POINT = 0;
	
	
	
	
	public static void checkIfDead(int newMoney, Player player) {
		player.setMoney(player.getMoney() + newMoney);
		if (player.getMoney() <= DEATH_POINT) {
			player.setDead(true);
		}
	}
	
	
	
	
	
	
	
}
