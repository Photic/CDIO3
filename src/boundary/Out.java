package boundary;

import entity.Player;
import entity.squares.GameBoard;


/**
 * This class controls outputs for the TUI
 * @author milter
 *
 */
public class Out {

	public Out() {
	}


	/**
	 *  Post a Welcome message at the start of the game.
	 */
	public void welcome() 
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
	 * Prints a message for the freeParking square.
	 */
	public void freeParking() {
		
		String[] outString =
			{
					"You park freely, but nothing else happens."
			};
		standardOut(outString);
		
	}
	
	
	
	/**
	 * Prints a message for the freeParking square.
	 */
	public void jailPrint(Player p) {
		
		String[] outString =
			{
					p.getName() + " is in jail and cannot move.",
					"Furthermore, you pay $1 to get out of jail."
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

	/**
	 * Chance card print
	 */
	public void chanceText() {
		String[] outString =
			{
					"The chance card reads the following: "
			};
		standardOut(outString);
	}
	
	/**
	 * pay card print
	 */
	public void payCardText() {
		String[] outString =
			{
					"You ate too much candy.",
					"Pay $2 to the bank."
			};
		standardOut(outString);
	}

	/**
	 * earn card print
	 */
	public void earnCardText() {
		String[] outString =
			{
					"You finally finished all of your homework!",
					"Recieve $2."
			};
		standardOut(outString);
	}
	
	
	/**
	 * You passed start message
	 */
	public void passedStart(Player p) {
		
		String[] outString =
			{
					p.getName() + " passed start and recieves 2"
			};
		standardOut(outString);
		
	}
	
	/**
	 * Prints a message stating the number of players playing
	 * @param n
	 * Number of players playing
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
	 * Ask the user to enter player names.
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
	 * Telling the users that a field is already owned.
	 * @param name
	 * Owners name
	 * @param rent
	 * Rent price of square
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
	 * A print if the square is owned by self.
	 * @param name
	 * Owner
	 */
	
	public void printSelfOwner(String name) 
	{
		String[] allNameEntrys = 
			{
					"This square is already owned by " + name,
					name + " stays for free."
			};
		standardOut(allNameEntrys);
	}


	/**
	 * A player summary print
	 * @param names
	 * Playernames
	 */
	public void printPlayerSummary(String[] names) 
	{
		String[] infoMessage = new String[names.length+1];
		infoMessage[0] = "Entered players are: ";

		for (int i = 1; i < infoMessage.length; i++) 
		{
			infoMessage[i] = names[i-1]; 
		}
		standardOut(infoMessage);
	}


	/**
	 *  Does the player want to buy a square ?
	 *  @param price
	 *  the price of the square
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
	
	/**
	 * Telling a Player they have lost.
	 * @param player
	 * The player who died
	 */
	public void youAreDead(Player player) 
	{
		String[] lost = 
			{
					"Player " +player+ "has died",
					"Since the player had no living relatives,",
					"all of their property is now back on the market"
			};
		standardOut(lost);
	}

	/**
	 * Tell the last person they have won.
	 * @param player
	 * The winning player
	 */
	public void announceWinner(Player player)
	{
		String[] winner = 
			{
				"***********************",
				"Congratulations " + player.getName(),
				"You are the winner of",
				"Monopoly Junior EXTREME!!",
				"**********************"
			};
		standardOut(winner);
		endEntry();
	}

	/**
	 * Print if player doesn't buy square
	 */
	public void notBuying() {
		String[] outprint = {
				"You decided not to buy the square."
		};
		standardOut(outprint);
	}

	/**
	 * Pay rent print
	 * @param owner
	 * Owner of square
	 * @param rent
	 * Rent of square
	 */
	public void payRent(Player owner, int rent) {
		String[] outString = 
			{
					"You pay "+rent + " int rent to "+owner.getName() 
			};
		standardOut(outString);
	}

	/**
	 * Square for sale print
	 * @param name
	 * Square name
	 * @param price
	 * Square price
	 */
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
	 * Playername
	 * @param sum
	 * Sum of dice
	 */
	public void evaluateDice(String name, int sum) 
	{
		String[] outString = 
			{
					name + " rolled the dice and the sum is: " +sum
			};
		standardOut(outString);
	}

	/**
	 * evaluate the new position
	 * @param newPosition
	 * new position
	 * @param gameboard
	 * the gameboard
	 */
	public void evaluateNewPos(int newPosition, GameBoard gameboard)
	{
		String[] outString = 
			{
					"You landed on " +gameboard.getField(newPosition).getNavn()
			};
		standardOut(outString);
	}
	
	/**
	 * Standard output, use for tekst field that does not require an output.
	 * @param outputText
	 * The text to be outputtet
	 */
	public void standardOut(String[] outputText)
	{
		System.out.println(" ------------------------------------------------------ ");
		int k = 0;

		for (int i = 0; i < outputText.length; i++) 
		{
			for (int j = 0; j < 60; j++) 
			{
				switch (j) 
				{
				case 1:
					System.out.print("|");
					break;
				case 3:
					j += outputText[k].length();
					System.out.print(outputText[k]); k++;
					break;
					//				case 55:
					//					System.out.print("|");
					//					break;
				default:
					System.out.print(" ");
					break;
				}

			}
			if (outputText.length > k)
			{
				System.out.println("");
			}

		}
		System.out.println("");
	}


	/**
	 * Output with a field for players to input to the system.
	 * @param outputText
	 * Text to be outputtet
	 */
	public void outWithInput(String[] outputText)
	{
		int k = 0;
		int j = 0;

		for (int i = 0; i < outputText.length; i++) 
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
					j += outputText[k].length();
					System.out.print(outputText[k]); k++;
					break;
				default:
					System.out.print(" ");
					break;
				}
			}
		}
	}

	/**
	 * Used as the last line.
	 */
	public void endEntry()
	{
		System.out.print(" ------------------------------------------------------ ");
	}


}
