package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;


public class GoToJail extends Square {

	
	public GoToJail(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) 
	{
		
	}


	
}
