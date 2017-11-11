package squares;

import java.awt.Color;

public class Lucky extends Square {
	
	private int prize;
	
	public Lucky(String navn, String description, Color color) {
		super(navn, description, color);
		this.prize = Integer.parseInt(description);
	}

	public int getPrize() {
		return prize;
	}
}
