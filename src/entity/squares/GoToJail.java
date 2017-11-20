package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;


public class GoToJail extends Square {

	
	private int prize;
	
	public GoToJail(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	public int getPrize() 
	{
		return prize;
	}
	
	public void setPrize(int a)
	{
		this.prize += a;
	}

	@Override
	public void whatToDoOnSquare(Player p, Out out) {
		// TODO Auto-generated method stub
		
	}


	
}
