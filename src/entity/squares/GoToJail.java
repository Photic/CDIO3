package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;

/**
 * GoToJail square
 *
 */
public class GoToJail extends Square {

	
	public GoToJail(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	/**
	 * print a message and position the player at the jail square.
	 */
	@Override
	public void squareLogic(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		out.goToJail();
		p.setPosition(6);	//Position 6 er jail på boardet
		p.setWalkedSquares(6); 
		p.setInJail(true);
	}


	
}
