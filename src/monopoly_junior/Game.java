package monopoly_junior;

import desktop_resources.GUI;
import gui.Gui;
import squares.GameBoard;

public class Game {
	
	
	private Gui gui;
	
<<<<<<< HEAD
=======


>>>>>>> a312aa83e0d3d6f31c766f9beb504dc868f817ce

	public Game() {
		gui = new Gui();
		
	}
	
	
	
	public Gui getGui() {
		return gui;
	}

	public void setGui(Gui gui) {
		this.gui = gui;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Game game = new Game();
		GameBoard gameboard = new GameBoard();
		
		
		game.getGui().defineGUI(game, gameboard);
		GUI.setDice(0, 0);
		
		
	}
	
	
	
}
