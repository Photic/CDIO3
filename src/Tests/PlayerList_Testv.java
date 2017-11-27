package Tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import entity.Player;
import entity.PlayerList;

public class PlayerList_Testv {

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

	
	@Test
	public void removePlayerIfDead(){
		boolean actual = false;
		boolean expected = true;
		String[] names = {"Stephan","Mathias","Steen"};
		PlayerList plist = new PlayerList(3, names, 10);
		for(int i = 0; i<plist.getLength(); i++){
			System.out.println("plads "+ i +" " +plist.getSpecificPlayer(i).getName());
		}
		plist.getSpecificPlayer(1).setDead(true);
		plist.removePlayerIfDead(plist.getSpecificPlayer(1), plist);
		System.out.println(plist.getLength());
		for(int i = 0; i<=3; i++){
			System.out.println("plads "+ i +" " +plist.getSpecificPlayer(i).getName());
			
		}
		
	}
	
	
	
	
}
