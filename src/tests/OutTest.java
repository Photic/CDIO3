package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import boundary.Out;
import entity.Player;
import entity.squares.GameBoard;

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
	public void testAnnounceWinner() {
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
	
	@Test
	public void testPrintOwner() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.printOwner("Mathias", 10);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | This square is already owned.                           \n" + 
				" | The owner is Mathias                                    \n" + 
				" | You pay 10 in rent.                                     \n" + 
				"", outContent.toString());	
	}
	
	@Test
	public void testwantToRoll() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.wantToRoll(p);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | It is now TestGuy's turn                                \n" + 
				" | Press 5 to roll the dice: ", outContent.toString());	
	}
	
	@Test
	public void testPrintSelfOwner() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.printSelfOwner(p.getName());
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | This square is already owned by TestGuy                 \n" + 
				" | TestGuy stays for free.                                 \n" + 
				"", outContent.toString());	
	}
	@Test
	public void testYouAreDead() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.youAreDead(p);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | Player "+p+"has died                   \n" + 
				" | Since the player had no living relatives,               \n" + 
				" | all of their property is now back on the market         \n" + 
				"", outContent.toString());	
	}
	
	@Test
	public void testPlayerNowOwns() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		GameBoard gameboard = new GameBoard();
		
		out.playerNowOwns(p, gameboard);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | TestGuy is now the owner of the Start                   \n" + 
				"", outContent.toString());	
	}
	
	@Test
	public void testWelcome() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.welcome();
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | Welcome to Menopoly Junior                              \n" + 
				" | Please enter the nunmber of players.                    \n" + 
				" | Has to be between 2-4: ", outContent.toString());	
	}
	@Test
	public void testWantToBuy() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.wantToBuy(p.getName(), 10);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | TestGuy is for sale. The price is: 10                   \n" + 
				" | Do you wanna buy it? Y/N                                \n" + 
				"", outContent.toString());	
	}
	
	@Test
	public void testJailPrint() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.jailPrint(p);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | TestGuy is in jail and cannot move.                     \n" + 
				" | Furthermore, you pay $1 to get out of jail.             \n" + 
				"", outContent.toString());	
	}
	@Test
	public void testplayerCount() {
		Out out = new Out();
		Player p = new Player("TestGuy", 20);
		
		out.playerCount(2);
		
		
		assertEquals(" ------------------------------------------------------ \n" + 
				" | Ahhh, you are: 2 players, nice!                         \n" + 
				" | Please enter player names                               \n" + 
				"", outContent.toString());	
	}
	
	

}
