package squares;

public class GameBoard {
	
	Square[] squares = new Square[32];
	Start start = new Start("Start", 10);
	Chance chance = new Chance("Chance");
	Territory territoryPurple1 = new Territory("BALLOON STAND", 10, "Purple");
	Territory territoryPurple2 = new Territory("PUPPET SHOW", 10, "Purple");
	Territory territoryGray1 = new Territory("PUPPET SHOW", 20, "Gray");
	Territory territoryGray2 = new Territory("PUPPET SHOW", 20, "Gray");
	
	public GameBoard()
	{	
		squares[0] = start;
		squares[1] = chance;
		squares[2] = territoryPurple1;
		squares[3] = territoryPurple2;
		squares[4] = chance;
		squares[5] = territoryGray1;
		squares[6] = territoryGray2;
	}
	
	public Square getFierld(int a)
	{
		return squares[a];
	}
	

}
