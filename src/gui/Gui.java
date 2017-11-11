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
		Field[] fields = new Field[5];
		
		//gameboard.getField(0).getName()
		fields[0] = new Street.Builder()
				.setTitle(gameboard.getField(0).getNavn())
				.setDescription("Recieve 4$ for passing.")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(gameboard.getField(1).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle(gameboard.getField(2).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(179, 102, 255))
				.build();
		
		fields[3] = new Street.Builder()
				.setTitle(gameboard.getField(3).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(179, 102, 255))
				.build();
		
		fields[4] = new Street.Builder()
				.setTitle(gameboard.getField(4).getNavn())
				.setDescription("Take a chance card")
				.setSubText("")
				.setBgColor(new Color(208, 251, 230))
				.build();
		
		
		GUI.create(fields);
	}

}
