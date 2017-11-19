package gamelogic;

import entity.Player;
import entity.squares.*;

public class RuleBook {
	
	
	
	
	public int startMoney(int playercount) 
	{	
		int out;
		
		switch(playercount) {
		
		case 2:
			out= 20;
			break;
		case 3:
			out= 18;
			break;
		case 4:
			out= 16;
			break;
		default:
			out = 20;
			break;
		}
		return out;
	}
	
	
	public void playerLands(GameBoard a, Player b, int squareNum)
	{
		a.getField(squareNum).whatToDoOnSquare(b, null);
	}
	
}
