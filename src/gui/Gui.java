package gui;


import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import monopoly_junior.Game;
import squares.GameBoard;

public class Gui {
	
	
	/**
	 * Use the GUI given by the teachers to create a GUI.
	 * @param game
	 * An instance of the player class
	 */
	public void defineGUI(Game game, GameBoard gameboard) {
		Field[] fields = new Field[3];
		
		//gameboard.getField(0).getName()
		fields[0] = new Street.Builder()
				.setTitle(gameboard.getFierld(0).getNavn())
				.setDescription("Recieve 4$ for passing.")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(gameboard.getFierld(1).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle(gameboard.getFierld(2).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		
		
		GUI.create(fields);
	}

}
