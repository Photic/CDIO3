package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gamelogic.GameLogic;

public class Test_Gamelogik {


	// Her testes metoden til at rykke fra et felt til et andet. 
	@Test
	public void newPosition_Test(){
		GameLogic gl = new GameLogic();
		assertTrue(gl.newPosition(3, 6, 24) == 9); //Tester for at rykke 6 felter frem
		assertTrue(gl.newPosition(23, 6, 24) == 5); //Tester for at nå max antal felter, at gå tilbage til 1 og fortsætte derfra
	}
	
	
	
}
