package tests;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import boundary.Gui;
import boundary.Out;
import controller.GameController;
import entity.Player;
import entity.PlayerList;
import entity.squares.Territory;

public class TerritoryTest {

	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void test() {
		
		Player p = new Player("TestGuy", 20);
		String[] names = {"Stephan","Mathias","Steen"};
		PlayerList playerlist = new PlayerList(3, names, 10);
		Out out = new Out();
		Gui gui = new Gui();
		
		
		Territory t = new Territory("Swimming Pool", "2", Color.blue, "2");
		t.whatToDoOnSquare(p, playerlist, out, gui);
		

		new GameController().territorySituation(0, true, 0);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | The Square is not owned                                 \n" + 
				" | The price is 2                                          \n" + 
				" | Do you want to buy it? 1=Yes, 0=No  ------------------------------------------------------ \n" + 
				" | You decided not to buy the square.                      \n" + 
				"", outContent.toString());
	}

}
