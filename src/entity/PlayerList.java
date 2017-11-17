package entity;

public class PlayerList {

	
	Player[] players;
	
	
	public PlayerList(int antal, String[] names) 
	{
		players = new Player[antal];
		
		for (int i = 0;i < antal;i++)
			players[i]= new Player(names[i]);	
	}
	
	
	
	
	public Player getSpecificPlayer(int n) {
		return players[n];
	}
	
	
	public int getLength() {
		return players.length;
	}
	
	
}
