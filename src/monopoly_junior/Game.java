package monopoly_junior;

import gui.Gui;

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
		
}
