package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;
import entity.cards.*;

public class Chance extends Square {
	
	
	Card currentCard;
	public Chance(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		Deck deck = new Deck(); 
		
		out.chanceText();
		
		
		deck.drawCard(p);
		
		
	}






	
	
}
