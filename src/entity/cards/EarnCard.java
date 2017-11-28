package entity.cards;

import boundary.Out;
import entity.Player;

/**
 * A chancecard where the players gets 2$
 * @author milter
 *
 */
public class EarnCard extends ChanceCard{

	private int amount;
	private Out out;

	public EarnCard(Out out) {
		this.amount = 2;
		this.out = out;
	}

	/**
	 * Use the card on the player
	 */
	public void useCard(Player p) {
		out.earnCardText();
		p.setBalance(p.getBalance() + amount);
	}



}
