package entity.squares;

import java.awt.Color;

public class GameBoard {
	
	Color standard = new Color(208, 251, 230);
	Color purple = new Color(179, 102, 255);
	Color grey = new Color(230, 230, 230);
	Color pink = new Color(255, 153, 255);
	Color orange = new Color(255, 117, 26);
	Color red = new Color(255, 51, 51);
	Color yellow = new Color(255, 255, 77);
	Color green = new Color(128, 255, 128);
	Color blue = new Color(102, 217, 255);
	
	// Prize pool.
		PrizePool prize = new PrizePool();
	
	final Square[] squares = new Square[] {
			new Start("Start", "Recieve 10$", standard),
			new Chance("CHANCE", "Pick a chance card", standard),
			new Territory("BALLOON STAND", "10", purple, "100"),
			new Territory("PUPPET SHOW", "10", purple, "100"),
			new Railway("YELLOW RAILWAY", "Player again", yellow),
			new Territory("PUPPET SHOW", "20", grey, "100"),
			new Territory("PUPPET SHOW", "20", grey, "100"),
			new Fireworks("FIREWORKS", "Pay 5$", standard),
			new RestRoom("REST ROOM", "Wait a turn", standard),
			new Territory("FERRES WHEEL", "10", pink, "100"),
			new Territory("CAR RIDE", "15", pink, "100"),
			new Railway("GREEN RAILWAY", "ROLL AGAIN", green),
			new Territory("HORROR HOUSE", "15", yellow, "100"),
			new Territory("POPCORN STAND", "15", yellow, "100"),
			new GiftShop("Uncle pennybags", "0", standard, prize),
			new Territory("CONVENIENCE STORE", "15", red, "100"),
			new Territory("MINI GOLF", "15", red, "100"),
			new Railway("BLUE RAILWAY", "ROLL AGAIN", blue),
			new Territory("LOOP THE LOOP", "15", orange, "100"),
			new Territory("ROLLER COASTER", "15", orange, "100"),
			new WaterShow("WATER SHOW", "Pay 2$", standard),
			new Tax("TAX TO RESTROOM", "Pay 3$ to the restroom", standard, prize),
			new Territory("MAGIC SHOW", "15", green, "100"),
			new Territory("OCTUPUS RIDE", "15", green, "100"),
			new Railway("RED RAILWAY", "ROLL AGAIN", red),
			new Territory("MOVIE HOUSE", "15", blue, "100"),
			new Territory("CHANGE STAGE", "15", blue, "100")
	};
	
	public Square getField(int a)
	{
		return squares[a];
	}
	
	public int getSize() 
	{
		return squares.length;
	}


}
