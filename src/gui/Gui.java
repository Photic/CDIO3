package gui;


import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import monopoly_junior.Game;

public class Gui {
	
	
	/**
	 * Use the GUI given by the teachers to create a GUI.
	 * @param game
	 * An instance of the player class
	 */
	public void defineGUI(Game game) {
		Field[] fields = new Field[1];
		fields[0] = new Street.Builder()
				.setTitle("The Rulebook!")
				.setDescription("The Tower (+250)\n"
						+ "The Crater (-100)\n"
						+ "The Palace Gates (+100)\n"
						+ "The Cold Desert (-20)\n"
						+ "The Walled city (+180)\n"
						+ "The Monastery (+0)\n"
						+ "The Black cave (-70)\n"
						+ "Huts in the mountain (+60)\n"
						+ "The Werewall (-80) - Extra turn\n"
						+ "The pit(-50)\n"
						+ "The Goldmine (+650)")
				.setSubText("")
				.setBgColor(Color.green)
				.build();
		GUI.create(fields);
		GUI.addPlayer(game.getP1().getName(), game.getP1().getScore());
		GUI.addPlayer(game.getP2().getName(), game.getP2().getScore());
	}

}
