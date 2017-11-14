package squares;

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
	
	
	
	
	Square[] squares = new Square[32];
	Start start = new Start("Start", "Recieve 10$", standard);
	Chance chance = new Chance("CHANCE", "Pick a chance card", standard);
	Territory territoryPurple1 = new Territory("BALLOON STAND", "10", purple);
	Territory territoryPurple2 = new Territory("PUPPET SHOW", "10", purple);
	Railway railwayYellow = new Railway("YELLOW RAILWAY", "Player again", yellow);
	Territory territoryGray1 = new Territory("PUPPET SHOW", "20", grey);
	Territory territoryGray2 = new Territory("PUPPET SHOW", "20", grey);
	Fireworks fireworks = new Fireworks("FIREWORKS", "Pay 5$", standard);
	RestRoom restRoom = new RestRoom("REST ROOM", "Wait a turn", standard);
	Territory territoryPink1 = new Territory("FERRES WHEEL", "10", pink);
	Territory territoryPink2 = new Territory("CAR RIDE", "15", pink);
	Railway railwayGreen = new Railway("GREEN RAILWAY", "ROLL AGAIN", green);
	Territory territoryYellow1 = new Territory("HORROR HOUSE", "15", yellow);
	Territory territoryYellow2 = new Territory("POPCORN STAND", "15", yellow);
	GiftShop unclePennybag = new GiftShop("Uncle pennybags", "0", standard);
	Territory territoryRed1 = new Territory("CONVENIENCE STORE", "15", red);
	Territory territoryRed2 = new Territory("MINI GOLF", "15", red);
	Railway railwayBlue = new Railway("BLUE RAILWAY", "ROLL AGAIN", blue);
	Territory territoryOrange1 = new Territory("LOOP THE LOOP", "15", orange);
	Territory territoryOrange2 = new Territory("ROLLER COASTER", "15", orange);
	WaterShow watershow = new WaterShow("WATER SHOW", "Pay 2$", standard);
	Tax tax = new Tax("TAX TO RESTROOM", "Pay 3$ to the restroom", standard);
	Territory territoryGreen1 = new Territory("MAGIC SHOW", "15", green);
	Territory territoryGreen2 = new Territory("OCTUPUS RIDE", "15", green);
	Railway railwayRed = new Railway("RED RAILWAY", "ROLL AGAIN", red);
	Territory territoryBlue1 = new Territory("MOVIE HOUSE", "15", blue);
	Territory territoryBlue2 = new Territory("CHANGE STAGE", "15", blue);

	
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
		squares[24] = watershow;
		squares[25] = chance;
		squares[26] = tax;
		squares[27] = territoryGreen1;
		squares[28] = territoryGreen2;
		squares[29] = railwayRed;
		squares[30] = territoryBlue1;
		squares[31] = territoryBlue2;
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
