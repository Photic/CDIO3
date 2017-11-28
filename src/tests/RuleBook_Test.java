package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entity.Player;
import entity.squares.GameBoard;
import gamelogic.RuleBook;

public class RuleBook_Test {

	//Her testes for alle de inkluderede statements i switch casen
	@Test
	public void startMoney_Test(){
		RuleBook rulebook = new RuleBook();
		assertTrue(rulebook.startMoney(2) == 20);
		assertTrue(rulebook.startMoney(3) == 18);
		assertTrue(rulebook.startMoney(4) == 16);
		assertTrue(rulebook.startMoney(387) == 20);
		}
	
	//Her testes om registreringen af at passere start
	@Test public void checkIfPassedStart_Test(){	
		boolean expected = true;
		RuleBook ruleb = new RuleBook();
		Player player = new Player("Stephan", 10);
		GameBoard gameb = new GameBoard();
		player.setWalkedSquares(25);
		boolean actual = ruleb.checkIfPassedStart(player, gameb);
		assertTrue(expected == actual);
		
		//tjekker at den ikke bliver true før felt 24
		boolean expected2 = false;
		player.setWalkedSquares(23);
		actual = ruleb.checkIfPassedStart(player, gameb);
		assertTrue(expected2 == actual);

	}
	
	

}
