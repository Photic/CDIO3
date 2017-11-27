package entity.squares;

import java.awt.Color;

import boundary.Gui;
import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Start extends Square {

	private final int getMoney = 10;
	
	public Start(String navn, String description, Color color) {
		super(navn, description, color);
	}

	public int getGetMoney() {
		return getMoney;
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out, Gui gui) 
	{
		//p.setBalance(p.getBalance()+getMoney);
	}

	
	



}
