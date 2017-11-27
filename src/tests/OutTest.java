package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import boundary.Out;
import entity.Player;

public class OutTest {

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
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.announceWinner(p);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | ***********************                                 \n" + 
				" | Congratulations TestGuy                                 \n" + 
				" | You are the winner of                                   \n" + 
				" | Monopoly Junior EXTREME!!                               \n" + 
				" | **********************                                  \n" + 
				" ------------------------------------------------------ ", outContent.toString());
		
		
		
	}

}
