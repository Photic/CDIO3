package tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import javax.swing.plaf.synth.SynthSeparatorUI;

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
		for(int i = 0; i<=plist.getLength()-2; i++){
			System.out.println("plads "+ i +" " +plist.getSpecificPlayer(i).getName());
		}
		if(plist.getSpecificPlayer(1).getName()==names[2]){
			actual =true;
		}
		else{
			System.out.println("Nope");
		}
		
		assertTrue(actual = expected);
	}
	

	
	
}
