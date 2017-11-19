package entity.squares;

import java.awt.Color;

import entity.Player;


public class Tax extends Square {
	
	private PrizePool prizePool;
	private final int pay = 3;
	
	public Tax(String navn, String description, Color color, PrizePool prizepool) 
	{
		super(navn, description, color);
		this.prizePool = prizepool;
	}
	
	
	
	@Override
	public void whatToDoOnSquare(Player p, Player[] players) 
	{
		p.setBalance(p.getBalance()-pay);
		prizePool.setPrize(prizePool.getPrize()+pay);
	}
	
	


	
	
	

	
	
}
