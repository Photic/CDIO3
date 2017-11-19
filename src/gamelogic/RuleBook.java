package gamelogic;

import boundary.Out;
import entity.squares.*;

public class RuleBook {
	
	
	
	
	public int startMoney(int playercount) {
		
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
		}
		return out;
	}
	
	
	
	
	public void getSquareLogic(GameBoard gameboard, int position) 
	{
		// Squares Rules
		if (gameboard.getField(position).getClass() == gameboard.getField(0).getClass())
		{
			
			
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(1).getClass())
		{
			// Some Chance code here.
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(2).getClass())
		{
			// Some Territory code here.

			((Territory)gameboard.getField(position));
			
			
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(5).getClass())
		{
			// Some Railway code here.
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(8).getClass())
		{
			// Some Fireworks code here.
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(10).getClass())
		{
			// Some RestRoom code here.
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(16).getClass())
		{
			// Some unclePennybag code here.
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(24).getClass())
		{
			// Some Watershow code here
		}
		else if (gameboard.getField(position).getClass() == gameboard.getField(26).getClass())
		{
			// Some tax code here
		}
		
	}
	
}
