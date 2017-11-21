package entity.squares;

import java.awt.Color;

import boundary.Out;
import entity.Player;
import entity.PlayerList;

public class Jail extends Square {

	public Jail(String navn, String description, Color color) 
	{
		super(navn, description, color);
	}

	public void whatToDoOnSquare(Player p, PlayerList playerlist, Out out) {
		// Indsæt out med hvem man besøger som er i jail.
		
	}



}
	
	

