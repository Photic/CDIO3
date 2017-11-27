package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Player;
import entity.PlayerList;
import gamelogic.GameLogic;

public class Test_Gamelogic {


	// Her testes metoden til at rykke fra et felt til et andet. 
	@Test
	public void newPosition_Test(){
		Player player = new Player("name", 10);
		GameLogic gl = new GameLogic();
		assertTrue(gl.newPosition(3, 6, 24) == 9); //Tester for at rykke 6 felter frem
		assertTrue(gl.newPosition(23, 6, 24) == 5); //Tester for at nå max antal felter, at gå tilbage til 1 og fortsætte derfra
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
