package entity;


public class Player {
		
	
	private String name;
	private int money;
	private boolean isWinner;
	private boolean isDead;
	private boolean inJail;
	private Die d1, d2;
	






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
		this.d1 = new Die();
		this.d2 = new Die();
	}

	
	public int rollDice() 
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
	public Die getD1() {
		return d1;
	}


	public void setD1(Die d1) {
		this.d1 = d1;
	}


	public Die getD2() {
		return d2;
	}


	public void setD2(Die d2) {
		this.d2 = d2;
	}
	
}

