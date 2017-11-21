package entity.cards;

import boundary.Keyboard;
import boundary.Out;
import entity.Player;

public class PayCard extends Card{

	int amount = - 2; 
	
	Out out = new Out();
	Keyboard keyboard = new Keyboard();
	
	public PayCard() {
		
	}
	
	public void useCard(Player p) {
		out.payCardText();
		p.setBalance(p.getBalance() + amount);
	}
	
	
	
}
