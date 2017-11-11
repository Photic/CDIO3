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
		Field[] fields = new Field[14];
		
		
		
		
		for (int i = 0; i <= 13; i++) {
			fields[i] = new Street.Builder()
					.setTitle(gameboard.getField(i).getNavn())
					.setDescription("")
					.setSubText(gameboard.getField(i).getDescription())
					.setBgColor(gameboard.getField(i).getColor())
					.build();
		}
		
		
//		
//		//gameboard.getField(0).getName()
//		fields[0] = new Street.Builder()
//				.setTitle(gameboard.getField(0).getNavn())
//				.setDescription("")
//				.setSubText("")
//				.setBgColor(gameboard.getField(0).getColor())
//				.build();
//		
//		fields[1] = new Street.Builder()
//				.setTitle(gameboard.getField(1).getNavn())
//				.setDescription("Take a chance card")
//				.setSubText("")
//				.setBgColor(new Color(208, 251, 230))
//				.build();
//		
//		fields[2] = new Street.Builder()
//				.setTitle(gameboard.getField(2).getNavn())
//				.setDescription("Price:")
//				.setSubText(((Territory)gameboard.getField(2)).getDescription() + "$")
//				.setBgColor(new Color(179, 102, 255))
//				.build();
//		
//		fields[3] = new Street.Builder()
//				.setTitle(gameboard.getField(3).getNavn())
//				.setDescription("Price:")
//				.setSubText(((Territory)gameboard.getField(3)).getDescription() + "$")
//				.setBgColor(new Color(179, 102, 255))
//				.build();
//		
//		fields[4] = new Street.Builder()
//				.setTitle(gameboard.getField(4).getNavn())
//				.setDescription("Take a chance card")
//				.setSubText("")
//				.setBgColor(new Color(208, 251, 230))
//				.build();
//		
		
		
		
		
		
		
		
		
		GUI.create(fields);
	}

}
