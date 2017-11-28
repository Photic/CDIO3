package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entity.Player;
import gamelogic.GameLogic;

public class Test_Gamelogic {


	@Test
	public void newPosition_Test(){
		GameLogic gl = new GameLogic();
		assertTrue(gl.newPosition(3, 6, 24) == 9);
		assertTrue(gl.newPosition(23, 6, 24) == 5);
	}
	
	@Test
	public void deadPlayer_Test(){
		boolean expected = false;
		boolean actual;
		GameLogic g1 = new GameLogic();
		Player player = new Player("Name", 5);
		g1.checkIfDead(player, null);
		actual = player.isDead();
		assertTrue(actual == expected);
	}
	
	@Test
	public void notDead_Test(){
		boolean expected = false;
		boolean actual;
		GameLogic g1 = new GameLogic();
		Player player = new Player("Name", 6);
		g1.checkIfDead(player, null);
		actual = player.isDead();
		assertTrue(actual == expected);
	}	
		
	

	
}
