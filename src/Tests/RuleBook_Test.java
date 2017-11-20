package Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gamelogic.RuleBook;

public class RuleBook_Test {

	//Her testes for alle de inkluderede statements i switch casen
	@Test
	public void rBookStartMoney(){
		RuleBook rulebook = new RuleBook();
		assertTrue(rulebook.startMoney(2) == 20);
		assertTrue(rulebook.startMoney(3) == 18);
		assertTrue(rulebook.startMoney(4) == 16);
		assertTrue(rulebook.startMoney(387) == 20);
		}
	
	@Test public void newTest(){	
	}	
	
	
	}
	
	


