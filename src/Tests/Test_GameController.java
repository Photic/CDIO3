package Tests;
import junit.runner.Version;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.GameController;

public class Test_GameController {

	@Before
	public void setUp() throws Exception 
	{
		new GameController().gameControl();
		
	}
	
	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void test() 
	{


		System.out.println("JUnit version is: " + Version.id());
	}

}
