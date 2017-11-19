package Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Player;
import entity.squares.PrizePool;
import entity.squares.Tax;

public class TaxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PrizePool pool = new PrizePool();
		
		Tax tax = new Tax("TestTax", "Test Description", new Color(0,0,0), pool);
		
		assertEquals(0, pool.getPrize());
		
		Player p = new Player("TestName", 10);
		
		tax.whatToDoOnSquare(p, new Player[0]);
		
		assertEquals(3, pool.getPrize());
		
		assertEquals(7, p.getBalance());
		
	}

}
