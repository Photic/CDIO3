package Tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import entity.PlayerList;

public class PlayerList_Testv2 {

	@Test
	public void test() {
		boolean actual = false;
		boolean expected = true;
		String[] names = {"Stephan","Mathias","Steen"};
		PlayerList plist = new PlayerList(3, names, 10);
		for(int i = 0; i<=plist.getLength(); i++){
			if (plist.getSpecificPlayer(i).getName()==names[i]){
				actual = true;
			}
			assertTrue(actual == expected);
		}


	}

}
