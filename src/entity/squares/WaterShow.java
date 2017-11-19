package entity.squares;

import java.awt.Color;

import desktop_codebehind.Player;

public class WaterShow extends Square {

	private final int pay = 2;
	
	
	public WaterShow(String navn, String description, Color color) {
		super(navn, description, color);
		// TODO Auto-generated constructor stub
	}

	
	public int getPay() {
		return pay;
	}


	@Override
	public void whatToDoOnSquare(Player p) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	

	
	
}
