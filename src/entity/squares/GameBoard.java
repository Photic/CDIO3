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
	Color turkies = new Color(31, 94, 90);
	Color magenta = new Color (229, 70, 0);
	
	Square[] squares = new Square[24];
	
	//Territory
	Territory tBurgerJoint = new Territory("BurgerJoint", "1", orange, "1");
	Territory tPizzaHouse = new Territory("Pizza Place", "1", orange, "1");
	Territory tCandyStore = new Territory("Candystore", "1", yellow, "1");
	Territory tIceCreamStore = new Territory("Icecream Store", "1", yellow, "1");
	Territory tMuseum = new Territory("Museum", "2", pink, "2");
	Territory tLibrary = new Territory("Library", "2", pink, "2");
	Territory tSkatePark = new Territory("Skatepark", "2", blue, "2");
	Territory tSwimmingPool = new Territory("Swimming Pool", "2", blue, "2");
	Territory tGamingHall = new Territory("Gaming Hall", "3", turkies, "3");
	Territory tMovies = new Territory("Movie Theater", "3", turkies, "3");
	Territory tToyStore = new Territory("Toy Store", "3", red, "3");
	Territory tAnimalStore = new Territory("Animal Store", "3", red, "3");
	Territory tBowling = new Territory("Bowling Ally", "4", grey, "4");
	Territory tZoo = new Territory("The Zoo", "4", grey, "4");
	Territory tWaterPark = new Territory("The Water Park", "4", purple, "4");
	Territory tBeachPromonade = new Territory("The Beach House", "4", purple, "4");
	
	//Chance
	Chance chance = new Chance("CHANCE", "Pick a chance card", standard);

	//Start
	Start start = new Start("Start", "Recieve 10$", standard);
	
	//goToJail: 1
	GoToJail goToJail = new GoToJail("GoToJail", "You are goin to jail. Pay a fine next turn to get released", standard);
	
	//beInJailOrVisit: 1
	Jail jail = new Jail("Locked up, or visiting", "You are either in jail, or locked up", standard);
	
	//FreeParking: 1
	FreeParking freeParking = new FreeParking("Free Parking", "Enjoy a relaxed moment", standard);
	

	public GameBoard()
	{	
		squares[0] = start;
		squares[1] = tBurgerJoint;
		squares[2] = tPizzaHouse;
		squares[3] = chance;
		squares[4] = tCandyStore;
		squares[5] = tIceCreamStore;
		squares[6] = jail;
		squares[7] = tMuseum;
		squares[8] = tLibrary;
		squares[9] = chance;
		squares[10] = tSkatePark;
		squares[11] = tSwimmingPool;
		squares[12] = freeParking;
		squares[13] = tGamingHall;
		squares[14] = tMovies;
		squares[15] = chance;
		squares[16] = tToyStore;
		squares[17] = tAnimalStore;
		squares[18] = goToJail;
		squares[19] = tBowling;
		squares[20] = tZoo;
		squares[21] = chance;
		squares[22] = tWaterPark;
		squares[23] = tBeachPromonade;

	}
	
	public Square getField(int a)
	{
		return squares[a];
	}
	
	public int getSize() 
	{
		return squares.length;
	}
	

}
