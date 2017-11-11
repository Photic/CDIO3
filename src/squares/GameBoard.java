package squares;

public class GameBoard {
	
	Square[] squares = new Square[32];
	Start start = new Start("Start", 10);
	Chance chance = new Chance();
	Territory territory = new Territory("Ballon Stand", 10, "Lilla");
	
	
	public GameBoard()
	{	
		squares[0] = start;
		
	}
	
	public Square getFierld(int a)
	{
		return squares[a];
	}
	

}
