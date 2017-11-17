package entity;

public class Player {
		
	
	private String name;
	private int score;
	
	private boolean isTurn;

	public Player(String n)
	{
		this.name = n;
		this.score = 0;
	}

	
	public int playTurn(Die d1, Die d2) 
	{
		d1.rollDie();
		d2.rollDie();
		return d1.getFaceValue()+d2.getFaceValue();
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}	
	
	public boolean isTurn() {
		return isTurn;
	}


	public void setTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}

	
	
	
}

