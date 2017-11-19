package entity.squares;

import java.awt.Color;
import entity.Player;

public class GiftShop extends Square {
	
	private PrizePool prizepool;
	
	public GiftShop(String navn, String description, Color color, PrizePool prizepool) 
	{
		super(navn, description, color);
		this.prizepool = prizepool;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ": " + prizepool.getPrize();
	}
	@Override
	public void whatToDoOnSquare(Player p, Player[] players) 
	{
		p.setBalance(p.getBalance()+prizepool.getPrize());
		prizepool.setPrize(0);
	}
	
}
