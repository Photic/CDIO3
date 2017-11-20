package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Start extends Square {

	private int getMoney = 10;
	
	public Start(String navn, String description, Color color) {
		super(navn, description, color);
	}

	public int getGetMoney() {
		return getMoney;
	}

	public void setGetMoney(int getMoney) {
		this.getMoney = getMoney;
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) 
	{
		p.setBalance(p.getBalance()+getMoney);
	}

	
	



}
