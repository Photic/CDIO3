package squares;

public class Start extends Square {

	private int getMoney;
	
	public Start(String navn, int getMoney) {
		super(navn);
		this.setGetMoney(getMoney);
	}

	public int getGetMoney() {
		return getMoney;
	}

	public void setGetMoney(int getMoney) {
		this.getMoney = getMoney;
	}

}
