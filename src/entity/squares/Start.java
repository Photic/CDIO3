package entity.squares;

import java.awt.Color;

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

}
