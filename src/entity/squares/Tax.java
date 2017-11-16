package entity.squares;

import java.awt.Color;

public class Tax extends Square {

	private final int pay = 3;
	
	public Tax(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	
	public int getPay() 
	{
		return pay;
	}
	
	


	
	
	

	
	
}
