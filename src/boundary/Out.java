package boundary;

public class Out {


	Screen s;
	private int amountOfPlayers;

	public Out() {
		s = new Screen();
	}

	public void welcomeNew() 
	{
		String[] welcome = 	
			{
					"Welcome to Menopoly Junior", 
					"Please enter the nunmber of players. "
			};
		standardOut(welcome);
		String[] playerCount =
			{
					"Has to be between 2-4: "
			};
		outWithInput(playerCount);
	}

	public void playerCount(int n) 
	{
		String[] count =
			{
					"Ahhh, you are: "+n+" players, nice!",
					"Please enter player names"
			};
		standardOut(count);
	}

	public void askForName(int playerNumber) 
	{
		String[] names = {
				"What is the name of player"+playerNumber+": "
		};
		outWithInput(names);
	}

	public void printName(int playerNumber, String name) 
	{
		String[] allNameEntrys = 
			{
				"Player "+playerNumber+": "+name  
			};
		standardOut(allNameEntrys);
	}
	
	public void printLine() 
	{
		s.println("");
	}


	public void printPlayerSummary(String[] names) 
	{
		String[] current = {"Current players are"};
		
	}

	public int getAmountPlayers() 
	{
		return amountOfPlayers;
	}

	public void setAmountPlayers(int amountPlayers) 
	{
		this.amountOfPlayers = amountPlayers;
	}

	public void standardOut(String[] a)
	{
		System.out.println(" ------------------------------------------------------ ");
		int k = 0;

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < 60; j++) 
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
//				case 55:
//					System.out.print("|");
//					break;
				default:
					System.out.print(" ");
					break;
				}

			}
			if (a.length > k)
			{
				System.out.println("");
			}

		}
		System.out.println("");
	}

	public void outWithInput(String[] a)
	{
		int k = 0;
		int j = 0;

		for (int i = 0; i < a.length; i++) 
		{
			int lengthOfString = 25;
			for (j = 0; j < lengthOfString; j++) 
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
				default:
					System.out.print(" ");
					break;
				}
			}
		}
	}
	
	public void startEntry()
	{
		System.out.println(" ------------------------------------------------------ ");
	}
	
	public void endEntry()
	{
		System.out.println("");
		System.out.println(" ------------------------------------------------------ ");
	}
	
	public void endCurrentOutput()
	{
		for (int i = 0; i < 30; i++) 
		{
			switch (i) {
			case 1:
				System.out.print("|");
				break;
			default:
				System.out.print(" ");
				break;
			}
		}
	}







	//	
	//	public void welcome()
	//	{
	//		String[] welcome = {"Welcome","To"};
	//		printer(welcome);
	//	}
}
