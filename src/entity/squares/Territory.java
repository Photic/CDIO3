package entity.squares;

import java.awt.Color;

public class Territory extends Square {
	
	private int price;
	private String rent;
	
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
	public void whatToDoOnSquare(entity.Player p) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	

	
	
}
