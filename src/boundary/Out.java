package boundary;

public class Out {
	
	
	
	
	Screen s;
	
	public Out() {
		s = new Screen();
	}
	
	
	public void welcomeNew() {
		s.println("Welcome to the game.");
	}
	
	public void howManyPlayers() {
		s.println("How many players are you? 2-6");
	}
	
	public void playerCount(int n) {
		s.println("Ahhh, you are " + n + " players, nice!");
	}
	
	public void askForName(int playerNumber) {
		s.println("What are player " + playerNumber + "'s name?");
	}
	
	public void printName(int playerNumber, String name) {
		s.println("Player " +playerNumber + "'s name is: " + name);
	}
	public void printLine() {
		s.println("");
	}
	
	public void printStraigthLine() {
		s.println("------------------------------------------------------------------------");
	}
	
	
	public void printPlayerSummary(String[] names) {
		s.println("The players are:");
		s.println("");
		
		for (int i = 1; i<names.length+1;i++)
			s.println("Player " + i + ": " + names[i-1]);
		
	}
	
	
	
	
	
	
	
	
	
	
//	public void printer(String[] welcome)
//	{
//		System.out.println("--------------------------------------------------------");
//		int k = 0;
//		for (int i = 0; i < welcome.length; i++) {
//			for (int j = 0; j < 30; j++) 
//			{
//				switch (j) {
//				case 1:
//					System.out.print("|");
//					break;
//				case 5:
//					System.out.print(welcome[k]); k++;
//					break;
//				case 29:
//					System.out.print("|");
//					break;
//				default:
//					System.out.print(" ");
//					break;
//				}
//			}
//			System.out.println("");
//		}
//		
//	}
//	
//	public void welcome()
//	{
//		String[] welcome = {"Welcome","To"};
//		printer(welcome);
//	}
}
