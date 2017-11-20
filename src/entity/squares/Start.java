package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Start extends Square {

	private int getMoney;
	
	public Start(String navn, String description, Color color) {
		super(navn, description, color);
		this.setGetMoney(getMoney);
	}

	public int getGetMoney() {
		return getMoney;
	}

	public void setGetMoney(int getMoney) {
		this.getMoney = getMoney;
	}

	@Override
	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) {
		// TODO Auto-generated method stub
		
	}

	
	



}
