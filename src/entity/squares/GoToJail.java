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
		
		out.goToJail();
		p.setPosition(6);	//Pos 6 er jail på boardet
		p.setWalkedSquares(6);
		p.setInJail(true);
		
	}


	
}
