package boundary;

import java.util.Scanner;
/** 
 * Implementerer input fra tastatur
 *
 */
public class Keyboard {
	private Scanner in;
	
	public Keyboard() {
		in = new Scanner(System.in);
	}

	
	/** Venter på en int. Returnerer først når brugeren indtaster den int der ventes på
	 * @param ind int der ventes på
	 */
	
	public void waitForInt(int ind)
	{
		int temp;
			do {
			temp = in.nextInt();
			}while (!(ind==temp)); 
	}
	
	public int getIntRange(int min, int max)
	{
		int temp;
			do {
			temp = in.nextInt();
			}while (temp<min || temp>max); 
		return temp;
	}
	
	
	public String getString() 
	{
		return in.next();
	}
	
	
	
	/** Venter p� at der tastes ENTER
	 */
	public void waitForEnter()
	{
		in.next();
	}
}
