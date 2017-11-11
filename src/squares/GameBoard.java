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
	Start start = new Start("Start", "10", standard);
	Chance chance = new Chance("Chance", "Pick a chance card", standard);
	Territory territoryPurple1 = new Territory("BALLOON STAND", "10", purple);
	Territory territoryPurple2 = new Territory("PUPPET SHOW", "10", purple);
	Railway railwayYellow = new Railway("YELLOW RAILWAY LINE", "Player again", yellow);
	Territory territoryGray1 = new Territory("PUPPET SHOW", "20", grey);
	Territory territoryGray2 = new Territory("PUPPET SHOW", "20", grey);
	Fireworks fireworks = new Fireworks("PAY 5$ TO SEE THE FIREWORKS", "5", standard);
	Cafe restRoom = new Cafe("REST ROOM", "", standard);
	Territory territoryPink1 = new Territory("FERRES WHEEL", "10", pink);
	Territory territoryPink2 = new Territory("CAR RIDE", "15", pink);
	Railway railwayGreen = new Railway("GREEN RAILWAY LINE", "ROLL AGAIN", green);
	
	
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
	}
	
	public Square getField(int a)
	{
		return squares[a];
	}
	

}
