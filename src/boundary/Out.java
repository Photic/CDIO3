package boundary;

import entity.Player;
import entity.squares.GameBoard;

public class Out {


	Screen s;
	private int amountOfPlayers;

	public Out() {
		s = new Screen();
	}


	/**
	 *  Post a Welcome message at the start of the game.
	 */
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

	
	/**
	 * This prints a message for the freeParking square.
	 */
	public void freeParking() {
		
		String[] outString =
			{
					"You park freely, but nothing else happens."
			};
		standardOut(outString);
		
	}
	
	/**
	 * Go to jail print
	 */
	public void goToJail() {
		String[] outString =
			{
					"You are getting locked up in Jail.",
					"You are moved to the jail square."
			};
		standardOut(outString);
	}

	
	
	public void moveManuallyCard() {
		String[] outString =
			{
					"You can now choose to move between 1 and 5 squares.",
			};
		standardOut(outString);
		String[] playerChoice =
			{
					"Enter a number between 1 and 5: "
			};
		outWithInput(playerChoice);
	}
	
	
	/**
	 * You passed start message
	 */
	public void passedStart(Player p) {
		
		String[] outString =
			{
					p.getName() + " passed start and recieves $10"
			};
		standardOut(outString);
		
	}
	
	/**
	 * Ask the player for the number if players playing.
	 * @param n
	 */
	public void playerCount(int n) 
	{
		String[] count =
			{
					"Ahhh, you are: "+n+" players, nice!",
					"Please enter player names"
			};
		standardOut(count);
	}


	/**
	 * As the user to enter player names.
	 * @param playerNumber
	 */
	public void askForName(int playerNumber) 
	{
		String[] names = {
				"What is the name of player "+playerNumber+": "
		};
		outWithInput(names);
	}


	/**
	 *  Print the players name.
	 * @param playerNumber
	 * @param name
	 */
	public void printName(int playerNumber, String name) 
	{
		String[] allNameEntrys = 
			{
					"Player "+playerNumber+": "+name  
			};
		standardOut(allNameEntrys);
	}


	/**
	 * Telling the users that a field is already owned.
	 * @param name
	 * @param rent
	 */
	public void printOwner(String name, int rent) 
	{
		String[] allNameEntrys = 
			{
					"This square is already owned.",
					"The owner is " + name,
					"You pay " +rent+ " in rent."
			};
		standardOut(allNameEntrys);
	}


	/**
	 * Print a list of 
	 * @param names
	 */
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


	/**
	 *  Does the player want to buy a square ?
	 *  @param price
	 */
	public void playerWantToBuy(int price)
	{
		String[] playerWant = 
			{
					"The Square is not owned",
					"The price is "+price
			};
		String[] askPlayer = 
			{
					"Do you want to buy it? 1=Yes, 0=No "
			};
		standardOut(playerWant);
		outWithInput(askPlayer);
	}


	/**
	 *  Telling the player it is their turn to roll
	 */
	public void wantToRoll(Player p) {

		String[] isIsNow = {
				"It is now "+p.getName()+"'s turn"
		};

		String[] askPlayer = 
			{
					"Press 5 to roll the dice: "
			};
		standardOut(isIsNow);
		outWithInput(askPlayer);
	}


	/**
	 * Telling the users that the player has bough the Territory
	 */
	public void playerNowOwns(Player p, GameBoard gameboard)
	{
		String[] owner = 
			{
					p.getName() + " is now the owner of the "+ gameboard.getField(p.getPosition()).getNavn()
			};
		standardOut(owner);
	}

	public void announceWinner(Player p)
	{
		String[] winner = 
			{
				"***********************",
				"Congratulations " + p.getName(),
				"You are the winner of",
				"Monopoly Junior EXTREME!!",
				"**********************"
			};
		standardOut(winner);
		endEntry();
	}

	/**
	 * If the player says no.
	 */
	public void notBuying() {
		String[] outprint = {
				"You decided not to buy the square."
		};
		standardOut(outprint);
	}

	public void payRent(Player owner, int rent) {
		String[] outString = 
			{
					"You pay "+rent + " int rent to "+owner.getName() 
			};
		standardOut(outString);
	}

	public void wantToBuy(String name, int price) {
		String[] outString = 
			{
					name + " is for sale. The price is: " + price,
					"Do you wanna buy it? Y/N"
			};
		standardOut(outString);
	}


	/**
	 * Telling the users what have been rolled.
	 * @param name
	 * @param sum
	 */
	public void evaluateDice(String name, int sum) 
	{
		String[] outString = 
			{
					name + " rolled the dice and the sum is: " +sum
			};
		standardOut(outString);
	}

	public void evaluateNewPos(int newPosition, GameBoard gameboard)
	{
		String[] outString = 
			{
					"You landed on " +gameboard.getField(newPosition).getNavn()
			};
		standardOut(outString);
	}


	/**
	 *  Use in the code to display the amount of players.
	 *  @return
	 */
	public int getAmountPlayers() 
	{
		return amountOfPlayers;
	}

	public void setAmountPlayers(int amountPlayers) 
	{
		this.amountOfPlayers = amountPlayers;
	}

	/**
	 * Standard output, use for tekst field that does not require an output.
	 * @param a
	 */
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


	/**
	 * Output with a field for players to input to the system.
	 * @param a
	 */
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

}
