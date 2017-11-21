package entity.cards;

import entity.Player;
import boundary.Keyboard;
import boundary.Out;

public class MoveManuallyCard extends Card{

	private Out out;
	private Keyboard keyboard;
	
	public MoveManuallyCard() {
		
	}
	
	public void execute(Player p) {
		out.moveManuallyCard();
		int playerChoice = keyboard.getIntRange(1, 5); 
		p.setPosition(p.getPosition() + playerChoice);
		
	}
	
	
}
