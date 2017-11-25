package Tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import entity.PlayerList;

public class PlayerList_Testv2 {

	@Test
	public void playerList_Test() {
		boolean actual = false;
		boolean expected = true;
		String[] names = {"Stephan","Mathias","Steen"};
		PlayerList plist = new PlayerList(3, names, 10);
		for(int i = 0; i<=plist.getLength()-1; i++){
			if (plist.getSpecificPlayer(0).getName()==names[0]){
				actual = true;
			}
			assertTrue(actual == expected);
		}
	}

}
