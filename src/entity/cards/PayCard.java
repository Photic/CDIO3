package entity.cards;

import boundary.Out;
import entity.Player;

public class PayCard extends ChanceCard{

	
	private int amount; 
	private Out out;
	
	
	public PayCard(Out out) {
		this.amount = -2;
		this.out = out;
		
	}
	/**
	 * Use the paycard on the player.
	 */
	public void useCard(Player p) {
		out.payCardText();
		p.setBalance(p.getBalance() + amount);
	}
	
}
