package Tests;
import junit.runner.Version;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.GameController;
import entity.PlayerList;

public class Test_GameController {

	@Before
	public void setUp() throws Exception 
	{
		new GameController().gameControl();
		String[] names = {"Stephan","Mathias","Steen"};
		PlayerList plist = new PlayerList(3, names, 10);
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
