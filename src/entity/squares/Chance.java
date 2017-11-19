package entity.squares;

import java.awt.Color;
import entity.Player;


public class Chance extends Square {
	
	String[] cards = {};
	
	public Chance(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	@Override
	public void whatToDoOnSquare(Player p, Player[] players) 
	{
		// Change logic here
	}



	
	
}
