package controller;

import boundary.Gui;
import boundary.Printer;

public class GameController {
	
	private Printer print = new Printer();
	private Gui gui;
	
	public GameController() 
	{
		gui = new Gui();
		print.welcome();
	}
	
	public Gui getGui() 
	{
		return gui;
	}

	public void setGui(Gui gui) 
	{
		this.gui = gui;
	}
		
}
