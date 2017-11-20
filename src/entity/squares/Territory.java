package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Territory extends Square {
	
	private int price, rentInt;
	private String rent;
	private boolean isOwned;
	public String owner;
	








	public Territory(String name, String description, Color color, String rent) 
	{
		super(name, description, color);
		this.price = Integer.parseInt(description);
		this.rent = rent;
		this.rentInt = Integer.parseInt(rent);
		this.isOwned = false;
		this.owner = "None";
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
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) {
		
		Player playerOwner = null;
		
		
		if (isOwned == true) {
			out.printOwner(owner, rentInt);
			
			for (int i = 0; i<playerlist.getLength(); i++) {
				if (playerlist.getSpecificPlayer(i).getName() == owner){
					playerOwner = playerlist.getSpecificPlayer(i);
				}
			}
			
			//Increase the owners money
			playerOwner.setMoney(playerOwner.getMoney() + rentInt);
			
			
			//decrease the landers money.
			p.setMoney(p.getMoney() - rentInt);
			
			
			
		}
		else {
			
			out.playerWantToBuy(price);
			
			
		}
		
		
	}
	
	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	

	
	
}
