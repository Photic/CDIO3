package monopoly_junior;

import desktop_resources.GUI;
import squares.GameBoard;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game();
		GameBoard gameboard = new GameBoard();
		
		
		game.getGui().defineGUI(game, gameboard);
		GUI.setDice(0, 0);
		
	}
	
}
