package entity.cards;

import entity.Player;

public class PayCard extends Card{

	int amount = - 2; 
	
	public PayCard() {
		
	}
	
	public void execute(Player p) {
		p.setBalance(p.getBalance() + amount);
	}
	
	
	
}
