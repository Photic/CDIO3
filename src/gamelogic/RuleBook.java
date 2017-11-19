package gamelogic;

import desktop_codebehind.Player;
import entity.squares.*;

public class RuleBook {
	
	
	/**
	 * This method that determines how much money the players will recieve at the beginning of the game, based on the number of players. 
	 * @param playercount
	 * The amount of people playing the game. 
	 * @return
	 * Returns an integer descriping how much money each player will start with. 
	 * 
	 */
	
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
		a.getField(squareNum).whatToDoOnSquare(b);
	}
	
	
	
	
//	public void getwhatToDoHere(GameBoard a, int b) 
//	{
//		
//		// Squares Rules
//		if (a.getField(b).getClass() == a.getField(0).getClass())
//		{
//			// Some start condition code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(1).getClass())
//		{
//			// Some Chance code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(2).getClass())
//		{
//			// Some Territory code here.
//			
//			Territory test = (Territory)a.getField(b);
//			
//			test.getRent();
//			
//			test.getPrice();
//			
//		}
//		else if (a.getField(b).getClass() == a.getField(5).getClass())
//		{
//			// Some Railway code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(8).getClass())
//		{
//			// Some Fireworks code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(10).getClass())
//		{
//			// Some RestRoom code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(16).getClass())
//		{
//			// Some unclePennybag code here.
//		}
//		else if (a.getField(b).getClass() == a.getField(24).getClass())
//		{
//			// Some Watershow code here
//		}
//		else if (a.getField(b).getClass() == a.getField(26).getClass())
//		{
//			// Some tax code here
//		}
//		
//	}
	
}
