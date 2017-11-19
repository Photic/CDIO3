package entity.squares;

import java.awt.Color;

import entity.Player;

public class Territory extends Square {
	
	private int price;
	private String rent;
	private Player owner;
	private boolean owned;
	
	public Territory(String navn, String description, Color color, String rent) 
	{
		super(navn, description, color);
		this.price = Integer.parseInt(description);
		this.rent = rent;
	}

	public int getPrice() 
	{
		return price;
	}
	
	public String getRent()
	{
		return rent;
	}
	
	@Override
	public void whatToDoOnSquare(Player p, Player[] players) 
	{
		if (owned == true)
		{
			for (int i = 0; i < players.length; i++) 
			{
				
			}
		}
		
		else if (owned == false)
		{
			
		}
		
	}
	
	public void buySquare()
	{
		
	}


	
	
	

	
	
}
