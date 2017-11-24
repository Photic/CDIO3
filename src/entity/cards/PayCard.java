package entity.cards;

import boundary.Keyboard;
import boundary.Out;
import entity.Player;

public class PayCard extends Card{

	public PayCard() {
		// TODO Auto-generated constructor stub
	}


	int amount = - 2; 
	
	Out out = new Out();
	Keyboard keyboard = new Keyboard();
	
	
	public void useCard(Player p) {
		out.payCardText();
		p.setBalance(p.getBalance() + amount);
	}
	
	
	
}
