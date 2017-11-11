package squares;

public class Territory extends Square {

	
	private int price;
	private String color;
	
	
	public Territory(String navn, int price, String color) {
		super(navn);
		this.setPrice(price);
		this.setColor(color);
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	

	
	


	
	
	

	
	
}
