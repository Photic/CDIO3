package squares;

import java.awt.Color;

public class Territory extends Square {
	
	private int price;
	
	public Territory(String navn, String description, Color color) 
	{
		super(navn, description, color);
		this.price = Integer.parseInt(description);
	}

	public int getPrice() 
	{
		return price;
	}
	

	
	


	
	
	

	
	
}
