package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Die;
import entity.Player;

public class PlayerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		
		Player p = new Player("TestGuy", 20);
		Die d1, d2;
		
		d1 = new Die();
		d2 = new Die();
		
		
		
		int roll = p.rollDice(d1, d2);
		
		boolean actual = roll>=2 && roll<=12;
		
		assertTrue(actual);
		
		
		
	}

}
