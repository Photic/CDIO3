package squares;

public class Fireworks extends Square {

	
	private int pay;
	
	public Fireworks(String navn, int pay) 
	{
		super(navn);
		this.setPay(pay);	
	}

	public int getPay() 
	{
		return pay;
	}

	public void setPay(int pay) 
	{
		this.pay = pay;
	}

}
