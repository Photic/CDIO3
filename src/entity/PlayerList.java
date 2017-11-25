package entity;

public class PlayerList {

	
	private Player[] players;
	
	
	
	public PlayerList(int antal, String[] names, int startMoney) 
	{
		players = new Player[antal];
		
		for (int i = 0;i < antal;i++)
			players[i]= new Player(names[i], startMoney);	
	}

//	public void removePlayerIfDead(Player p, PlayerList playerList)
//	{
//		Player[] removeDeads = new Player[playerList.getLength()-1];
//		
//		int j = 0;
//		for (int i = 0; i < players.length; i++) 
//		{
//			if (p != playerList.getSpecificPlayer(i))
//				removeDeads[j] = playerList.getSpecificPlayer(i);
//		}
//		setList(removeDeads);
//	}
	
	
	public void removePlayerIfDead2(Player p, PlayerList playerList){
		Player[] removeDeads = new Player[playerList.getLength()-1];
		for (int i = 0; i < players.length-1; i++) 
		{
			if (playerList.getSpecificPlayer(i).isDead()==false)
				removeDeads[i] = playerList.getSpecificPlayer(i);
			else if(playerList.getSpecificPlayer(i).isDead()==true){
				System.out.println("Player: "+ playerList.getSpecificPlayer(i).getName()+ " removed");
			}
		}
		
		setList(removeDeads);
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
	
	public void setList(Player[] playerList)
	{
		this.players = playerList;
	}
	
}
