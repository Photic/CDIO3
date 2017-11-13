package monopoly_junior;

import desktop_resources.GUI;
import gui.Gui;
import squares.GameBoard;

public class Game {
	
	
	private Gui gui;
	


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
