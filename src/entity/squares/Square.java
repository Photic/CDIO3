package entity.squares;

import java.awt.Color;

import entity.Player;

public abstract class Square {

	private String navn;
	private String description;
	private Color color;
	
	public Square(String navn, String description, Color color)
	{
		this.navn = navn;
		this.description = description;
		this.color = color;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void whatToDoOnSquare(Player p);

	
}
