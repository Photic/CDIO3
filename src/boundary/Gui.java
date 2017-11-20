package boundary;


import java.awt.Color;

import controller.GameController;
import desktop_codebehind.Car;
import entity.Player;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Die;
import entity.PlayerList;
import entity.squares.GameBoard;

public class Gui {
	
	
	/**
	 * Use the GUI given by the teachers to create a GUI.
	 * @param game
	 * An instance of the player class
	 */
	public void defineGUI(GameBoard gameboard) {
		Field[] fields = new Field[gameboard.getSize()];
		
		
		
		for (int i = 0; i <= gameboard.getSize()-1; i++) {
			fields[i] = new Street.Builder()
					.setTitle(gameboard.getField(i).getNavn())
					.setDescription(gameboard.getField(i).getNavn())
					.setSubText(gameboard.getField(i).getDescription())
					.setBgColor(gameboard.getField(i).getColor())
					.build();
		}
		
		GUI.create(fields);
		GUI.setDice(1, 1);
	}
	
	
	public void updateBalance(Player player) {
		GUI.setBalance(player.getName(), player.getMoney());
	}
	
	
	public void setDice(Die d1, Die d2) {
		GUI.setDice(d1.getFaceValue(), d2.getFaceValue());
	}
	
	
	public void setNames(PlayerList playerList) {
		
		for (Player p : playerList.getList()) {
			GUI.addPlayer(p.getName(), p.getMoney());
		}
	}

}
