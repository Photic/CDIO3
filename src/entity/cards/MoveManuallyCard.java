package entity.cards;

import boundary.Keyboard;
import boundary.Out;
import entity.Player;

public class MoveManuallyCard extends Card{
	
	public MoveManuallyCard() {
		super();
	}
	
	Out out = new Out();
	Keyboard keyboard = new Keyboard();
	
	public void execute(Player p) {
		out.moveManuallyCard();
		int playerChoice = keyboard.getIntRange(1, 5); 
		p.setPosition(p.getPosition() + playerChoice);
		
	}
	
	
}
