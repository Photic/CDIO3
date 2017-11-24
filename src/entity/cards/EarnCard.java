package entity.cards;

import boundary.Keyboard;
import boundary.Out;
import entity.Player;

public class EarnCard extends Card{

	int amount = 2; 
	
	public EarnCard() {
	}
	
	Out out = new Out();
	Keyboard keyboard = new Keyboard();
	
	public void useCard(Player p) {
		out.earnCardText();
		p.setBalance(p.getBalance() + amount);
	}
	
	
	
}
