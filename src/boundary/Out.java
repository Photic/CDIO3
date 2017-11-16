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
	
	public void askForNames() {
		s.println("What are your names?");
	}
	
	public void printName(String name) {
		s.println("Ahh, your name is " + name);
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
