package entity.cards;

import entity.Player;

public class EarnCard extends Card{

	int amount = 2; 
	
	public EarnCard() {
		
	}
	
	public void execute(Player p) {
		p.setBalance(p.getBalance() + amount);
	}
	
	
	
}
