package entity;

import entity.squares.Territory;

public class Player {
		
	
	private String name;
	private int money;
	private int position;
	private boolean getAnotherTurn;
	private Territory[] ownedSquares;
	private int amountOfSquaresOwned = 0;

	public Player(String n, int startMoney)
	{
		this.name = n;
		this.money = startMoney;
		this.position = 0;
	}

	public int rollDice(Die d1, Die d2) 
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

	public int getBalance() 
	{
		return money;
	}

	public void setBalance(int score) 
	{
		this.money = score;
	}	

	public int getPosition() 
	{
		return position;
	}

	public void setPosition(int position) 
	{
		this.position = position;
	}

	public boolean isGetAnotherTurn() 
	{
		return getAnotherTurn;
	}

	public void setGetAnotherTurn(boolean getAnotherTurn) 
	{
		this.getAnotherTurn = getAnotherTurn;
	}

	public Territory[] getOwnedSquares() 
	{
		return ownedSquares;
	}

	public void setOwnedSquares(Territory[] ownedSquares) 
	{
		this.ownedSquares = ownedSquares;
	}

	public int getAmountOfSquaresOwned() 
	{
		return amountOfSquaresOwned;
	}

	public void setAmountOfSquaresOwned(int amountOfSquaresOwned) 
	{
		this.amountOfSquaresOwned = amountOfSquaresOwned;
	}
	
}

