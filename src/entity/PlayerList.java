package entity;

public class PlayerList {

	
	Player[] players;
	
	
	public PlayerList(int antal, String[] names, int startMoney) 
	{
		players = new Player[antal];
		
		for (int i = 0;i < antal;i++)
			players[i]= new Player(names[i], startMoney);	
	}
	
	public void playerHasLost(Player p)
	{
		Player[] playersLeft = new Player[getLength()-1];
		
		for (int i = 0; i < getLength()-1; i++) 
		{
			if (p != getSpecificPlayer(i))
			{
				playersLeft[i] = getSpecificPlayer(i);
			}
		}
		players = playersLeft;
	}
	
	public Player getSpecificPlayer(int n) {
		return players[n];
	}
	
	
	public int getLength() {
		return players.length;
	}
	
	public Player[] getList() {
		return players;
	}
	
}
