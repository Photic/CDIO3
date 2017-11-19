package entity.squares;

import java.awt.Color;

import desktop_codebehind.Player;

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
	public void whatToDoOnSquare(Player p) 
	{
		// TODO Auto-generated method stub
		
	}

}
