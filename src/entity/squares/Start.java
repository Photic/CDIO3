package entity.squares;

import java.awt.Color;
import entity.Player;


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
	public void whatToDoOnSquare(Player p, Player[] players) {
		// TODO Auto-generated method stub
		
	}

}
