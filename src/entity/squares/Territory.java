package entity.squares;

import java.awt.Color;

import entity.Player;
import entity.PlayerList;

public class Territory extends Square {
	
	private int price, rentInt;
	private String rent;
	private boolean isOwned;
	






	public Territory(String name, String description, Color color, String rent) 
	{
		super(name, description, color);
		this.price = Integer.parseInt(description);
		this.rent = rent;
		this.rentInt = Integer.parseInt(rent);
		this.isOwned = false;
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
	public void whatToDoOnSquare(Player p, PlayerList playerlist) {
		
		
		
		
	}
	
	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	
	
	

	
	
}
