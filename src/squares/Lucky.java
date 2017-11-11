package squares;

public class Lucky extends Square {

	private int prize;
	
	public Lucky(String navn, int prize) {
		super(navn);
		this.setPrize(prize);
		// TODO Auto-generated constructor stub
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

}
