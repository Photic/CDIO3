package squares;

import java.awt.Color;

public class Fireworks extends Square {

	
	private int pay;
	
	public Fireworks(String navn, String description, Color color) 
	{
		super(navn, description, color);

	}

	public int getPay() 
	{
		return pay;
	}

	public void setPay(int pay) 
	{
		this.pay = pay;
	}

}
