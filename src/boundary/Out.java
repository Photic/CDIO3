package boundary;

public class Out {

	private int amountOfPlayers;
//	Screen s;
//	
//
//	public Out() {
//		s = new Screen();
//	}


	// Welcome to the game message.
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

	// Gives a message, telling the user to enter the names of the players playing.
	public void playerCount(int n) 
	{
		String[] count =
			{
					"Ahhh, you are: "+n+" players, nice!",
					"Please enter player names"
			};
		standardOut(count);
	}


	// Message for actually asking for names.
	public void askForName(int playerNumber) 
	{
		String[] names = {
				"What is the name of player "+playerNumber+": "
		};
		outWithInput(names);
	}

	// Shows a list of all the enterede player names.
	public void printPlayerSummary(String[] names) 
	{
		String[] infoMessage = new String[names.length+1];
		infoMessage[0] = "Enterede Players are: ";

		for (int i = 1; i < infoMessage.length; i++) 
		{
			infoMessage[i] = names[i-1]; 
		}
		standardOut(infoMessage);
	}

	// Prints a player name. 
	public void printName(int playerNumber, String name) 
	{
		String[] allNameEntrys = 
			{
					"Player "+playerNumber+": "+name  
			};
		standardOut(allNameEntrys);
	}

	public void playerChoice(int buy)
	{
		String[] choice = 
			{
					"This square is not owned by anyone",
					"Do you want to buy it ? y/n"
			};
		outWithInput(choice);
	}



	// Output Logic. 
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

	public void endEntry()
	{
		System.out.print(" ------------------------------------------------------ ");
	}

	public void printLine()
	{
		System.out.println("");
	}

	public int getAmountPlayers() 
	{
		return amountOfPlayers;
	}

	public void setAmountPlayers(int amountPlayers) 
	{
		this.amountOfPlayers = amountPlayers;
	}

}
