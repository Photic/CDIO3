package squares;

import java.awt.Color;

public class GiftShop extends Square {
	
	private int prize;
	
	public GiftShop(String navn, String description, Color color) {
		super(navn, description, color);
		this.prize = Integer.parseInt(description);
	}

	public int getPrize() {
		return prize;
	}
}
