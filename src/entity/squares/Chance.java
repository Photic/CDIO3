package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;
import entity.cards.*;


/**
 * The chance square.
 *
 */
public class Chance extends Square {
	
	public Chance(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	/**
	 * Draw a chanceCard from the deck of chancecard. Then print a message and show the card.
	 */
	@Override
	public void squareLogic(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		Deck deck = new Deck(out); 
		
		out.chanceText();
		
		deck.drawCard(p);
		
	}






	
	
}
