package entity.squares;

import java.awt.Color;

import desktop_codebehind.Player;

public class GiftShop extends Square {
	
	private int prize;
	
	public GiftShop(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	public int getPrize() 
	{
		return prize;
	}
	
	public void setPrize(int a)
	{
		this.prize += a;
	}

	@Override
	public void whatToDoOnSquare(Player p) {
		// TODO Auto-generated method stub
		
	}
	
}
