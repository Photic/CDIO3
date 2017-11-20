package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;


public class FreeParking extends Square {


	public FreeParking(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) 
	{
		
		out.freeParking();
		
		
	}
	
}
