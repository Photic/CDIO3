package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;

/**
 * Free parking square
 *
 */
public class FreeParking extends Square {


	public FreeParking(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	/**
	 * Print a message.
	 */
	@Override
	public void squareLogic(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		out.freeParking();
	}

}
