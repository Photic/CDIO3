package boundary;

public class Out {
	
	
	
	
	Screen s;
	
	public Out() {
		s = new Screen();
	}
	
	public void standardOut(String[] a)
	{
			System.out.println(" ------------------------------------------------------ ");
			int k = 0;
			
			for (int i = 0; i < a.length; i++) 
			{
				int lengthOfString = 60;
				for (int j = 0; j < lengthOfString; j++) 
				{
					switch (j) 
					{
					case 1:
						System.out.print("|");
						break;
					case 3:
						j += a[k].length();
						System.out.print(a[k]); k++;
						break;
					case 55:
						System.out.print("|");
						break;
					default:
						System.out.print(" ");
						break;
					}
				}
				System.out.println("");
			}
			System.out.println(" ------------------------------------------------------ ");
	}
	
//	public void outWithInput(String[] a)
//	{
//			System.out.println(" ------------------------------------------------------ ");
//			int k = 0;
//			
//			for (int i = 0; i < a.length; i++) 
//			{
//				int lengthOfString = 60;
//				for (int j = 0; j < lengthOfString; j++) 
//				{
//					switch (j) 
//					{
//					case 1:
//						System.out.print("|");
//						break;
//					case 3:
//						j += a[k].length();
//						System.out.print(a[k]); k++;
//						break;
//					case 55:
//						System.out.print("|");
//						break;
//					default:
//						System.out.print(" ");
//						break;
//					}
//				}
//				System.out.println("");
//			}
//			System.out.println(" ------------------------------------------------------ ");
//	}
	
	public void welcomeNew() 
	{
		String[] welcome = 	
			{
				"Welcome to Menopoly Junior", 
				"Please enter a number fo players from 2-4"
			};
		standardOut(welcome);
	}
	
	public void playerCount(int n) 
	{
		String[] count =
			{
				"Ahhh, you are: "+n +
				" players, nice!",
				"Please enter player names"
			};
		standardOut(count);
	}
	
	public void askForName(int playerNumber) 
	{
		s.println("What are player " + playerNumber + "'s name?");
	}
	
	public void printName(int playerNumber, String name) 
	{
		s.println("Player " +playerNumber + "'s name is: " + name);
	}
	public void printLine() 
	{
		s.println("");
	}
	
	
	public void printPlayerSummary(String[] names) 
	{
		
		s.println("The players are:");
		s.println("");
		
		for (int i = 1; i<names.length+1;i++)
			s.println("Player " + i + ": " + names[i-1]);
	}
	
	
	
	
	
	
	
	
	
	

//	
//	public void welcome()
//	{
//		String[] welcome = {"Welcome","To"};
//		printer(welcome);
//	}
}
