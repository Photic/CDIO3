package entity.squares;

import java.awt.Color;
import boundary.Out;
import entity.Player;
import entity.PlayerList;
import entity.cards.*;

public class Chance extends Square {
	
	public Chance(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) 
	{
		Deck deck = new Deck(); 
		
		deck.shuffle(); 
		out.chanceText();
		deck.next(p);
		
		
	}






	
	
}
