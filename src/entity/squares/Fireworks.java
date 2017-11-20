package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;

public class Fireworks extends Square {

	private final int pay = 5;
	
	public Fireworks(String navn, String description, Color color) 
	{
		super(navn, description, color);

	}

	public int getPay() 
	{
		return pay;
	}

	@Override
	public void whatToDoOnSquare(Player p, Out out) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
