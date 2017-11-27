package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Territory extends Square {

	private int price, rentInt;
	private String rent;
	private boolean isOwned;
	private Player owner;

	public Territory(String name, String description, Color color, String rent) 
	{
		super(name, description, color);
		this.price = Integer.parseInt(description);
		this.rent = rent;
		this.rentInt = Integer.parseInt(rent);
		this.isOwned = false;
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		if (isOwned == true)
		{
			if (owner.getName() == p.getName()) {
				out.printSelfOwner(p.getName());
			} else {
				out.printOwner(owner.getName(), rentInt);
			}

			//Increase the owners money
			owner.setBalance(owner.getBalance() + rentInt);

			//decrease the landers money.
			p.setBalance(p.getBalance() - rentInt);

		} 
		else 
		{	
			out.playerWantToBuy(price);
		}

	}

	public int getPrice() 
	{
		return price;
	}

	public String getRent()
	{
		return rent;
	}

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) 
	{
		this.isOwned = isOwned;
	}
	public Player getOwner() 
	{
		return owner;
	}

	public void setOwner(Player owner) 
	{
		this.owner = owner;
	}



	public void removeDeadOwner(Player p) 
	{
		if (isOwned == true) 
		{
			if (p == owner) 
			{
				owner = null;
				isOwned = false;
			}
		}

	}




}
