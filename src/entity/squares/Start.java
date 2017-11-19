package entity.squares;

import java.awt.Color;
import desktop_codebehind.Player;

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
	public void whatToDoOnSquare(Player p) {
		// TODO Auto-generated method stub
		
	}

}
