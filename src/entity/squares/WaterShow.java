package entity.squares;

import java.awt.Color;

import entity.Player;


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
	public void whatToDoOnSquare(Player p, Player[] players) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	

	
	
}
