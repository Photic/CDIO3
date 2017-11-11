package squares;

public class Railway extends Square {

	private String color;
	
	public Railway(String navn, String color) {
		super(navn);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
