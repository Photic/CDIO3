package entity.squares;

import java.awt.Color;

<<<<<<< HEAD:src/entity/squares/GoToJail.java
public class GoToJail extends Square {
=======
import desktop_codebehind.Player;

public class GiftShop extends Square {
>>>>>>> master:src/entity/squares/GiftShop.java
	
	private int prize;
	
	public GoToJail(String navn, String description, Color color) 
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
