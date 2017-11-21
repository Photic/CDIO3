package entity;


public class Player {
		
	
	private String name;
	private int money;
	private boolean isWinner;
	private boolean isDead;
	private boolean inJail;
	private int walkedSquares;
	private int position;
	private boolean isTurn;

	public Player(String n, int startMoney)
	{
		this.name = n;
		this.money = startMoney;
		this.isWinner = false;
		this.isDead = false;
		this.inJail = false;
		this.position = 0;
		this.walkedSquares = 0;
	}

	
	public int rollDice(Die d1, Die d2) 
	{
		d1.rollDie();
		d2.rollDie();
		setWalkedSquares(walkedSquares + (d1.getFaceValue()+d2.getFaceValue()));
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
	
	public boolean isTurn() {
		return isTurn;
	}


	public void setTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}

	public boolean isWinner() {
		return isWinner;
	}


	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	public boolean isDead() {
		return isDead;
	}


	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}
	public boolean isInJail() {
		return inJail;
	}


	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}

	public int getWalkedSquares() {
		return walkedSquares;
	}


	public void setWalkedSquares(int walkedSquares) {
		this.walkedSquares = walkedSquares;
	}
	
}

