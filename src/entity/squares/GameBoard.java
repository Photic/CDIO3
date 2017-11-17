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
	
	Square[] squares = new Square[23];
	
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
	Territory tBeachHouse = new Territory("The Beach House", "4", purple, "4");
	
	//Chance
	Chance chance = new Chance("CHANCE", "Pick a chance card", standard);

	
	//goToJoin: 1
	//beInJailOrVisit: 1
	//Start: 1
	//FreeParking: 1
	
	
	Start start = new Start("Start", "Recieve 10$", standard);
	
	Territory territoryPurple1 = new Territory("BALLOON STAND", "1000", purple, "100");
	Territory territoryPurple2 = new Territory("PUPPET SHOW", "10", purple, "100");
	Territory territoryGray1 = new Territory("PUPPET SHOW", "20", grey, "100");
	Territory territoryGray2 = new Territory("PUPPET SHOW", "20", grey, "100");
	Fireworks fireworks = new Fireworks("FIREWORKS", "Pay 5$", standard);
	RestRoom restRoom = new RestRoom("REST ROOM", "Wait a turn", standard);
	Territory territoryPink1 = new Territory("FERRES WHEEL", "10", pink, "100");
	Territory territoryPink2 = new Territory("CAR RIDE", "15", pink, "100");
	Railway railwayGreen = new Railway("GREEN RAILWAY", "ROLL AGAIN", green);
	Territory territoryYellow1 = new Territory("HORROR HOUSE", "15", yellow, "100");
	Territory territoryYellow2 = new Territory("POPCORN STAND", "15", yellow, "100");
	GiftShop unclePennybag = new GiftShop("Uncle pennybags", "0", standard);
	Territory territoryRed1 = new Territory("CONVENIENCE STORE", "15", red, "100");
	Territory territoryRed2 = new Territory("MINI GOLF", "15", red, "100");
	Railway railwayBlue = new Railway("BLUE RAILWAY", "ROLL AGAIN", blue);
	Territory territoryOrange1 = new Territory("LOOP THE LOOP", "15", orange, "100");
	Territory territoryOrange2 = new Territory("ROLLER COASTER", "15", orange, "100");
	WaterShow watershow = new WaterShow("WATER SHOW", "Pay 2$", standard);
	Tax tax = new Tax("TAX TO RESTROOM", "Pay 3$ to the restroom", standard);
	Territory territoryGreen1 = new Territory("MAGIC SHOW", "15", green, "100");
	Territory territoryGreen2 = new Territory("OCTUPUS RIDE", "15", green, "100");
	Railway railwayRed = new Railway("RED RAILWAY", "ROLL AGAIN", red);
	Territory territoryBlue1 = new Territory("MOVIE HOUSE", "15", blue, "100");
	Territory territoryBlue2 = new Territory("CHANGE STAGE", "15", blue, "100");

	
	public GameBoard()
	{	
		squares[0] = start;
		squares[1] = chance;
		squares[2] = territoryPurple1;
		squares[3] = territoryPurple2;
		squares[4] = chance;
		squares[5] = railwayYellow;
		squares[6] = territoryGray1;
		squares[7] = territoryGray2;
		squares[8] = fireworks;
		squares[9] = chance;
		squares[10] = restRoom;
		squares[11] = territoryPink1;
		squares[12] = territoryPink2;
		squares[13] = railwayGreen;
		squares[14] = territoryYellow1;
		squares[15] = territoryYellow2;
		squares[16] = unclePennybag;
		squares[17] = chance;
		squares[18] = territoryRed1;
		squares[19] = territoryRed2;
		squares[20] = chance;
		squares[21] = railwayBlue;
		squares[22] = territoryOrange1;
		squares[23] = territoryOrange2;

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
