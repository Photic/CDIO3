package gui;


import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import monopoly_junior.Game;
import squares.GameBoard;
import squares.Territory;

public class Gui {
	
	
	/**
	 * Use the GUI given by the teachers to create a GUI.
	 * @param game
	 * An instance of the player class
	 */
	public void defineGUI(Game game, GameBoard gameboard) {
		Field[] fields = new Field[gameboard.getSize()];
		
		
		
		
		for (int i = 0; i <= gameboard.getSize()-1; i++) {
			fields[i] = new Street.Builder()
					.setTitle(gameboard.getField(i).getNavn())
					.setDescription("")
					.setSubText(gameboard.getField(i).getDescription())
					.setBgColor(gameboard.getField(i).getColor())
					.build();
		}
		
		
		
		
		
		
		
		
		GUI.create(fields);
	}

}
