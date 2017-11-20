package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;

public class Territory extends Square {
	
	private int price, rentInt;
	private String rent;
	private Player owner;
	




	public Territory(String name, String description, Color color, String rent) 
	{
		super(name, description, color);
		this.price = Integer.parseInt(description);
		this.rent = rent;
		this.rentInt = Integer.parseInt(rent);
		this.owner = null;
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
	public void whatToDoOnSquare(Player p, Out out) {
		
		
		
		
	}
	
	
	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	
	
	

	
	
}
