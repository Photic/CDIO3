package boundary;

import java.util.Scanner;
/** 
 * Implementerer input fra tastatur
 *
 */
public class Keyboard{
	private Scanner in;
	
	public Keyboard() {
		in = new Scanner(System.in);
	}
	
	
	/** Venter på en int. Returnerer først når brugeren indtaster den int der ventes på
	 * @param ind int der ventes på
	 */
	public void waitForInt(int ind)
	{
		int temp = 0;
			do {
				try{temp = in.nextInt();}
				catch (Exception e){	System.out.println("Er det et tal bøv?");}
			}while (!(ind==temp)); 
	}
	
	public int getIntRange(int min, int max)
	{
		int temp = 2;
			do {
				try{temp = in.nextInt();}
				catch(Exception e){System.out.println("Er det er tal bøv?"); break;}
			}while (temp<min || temp>max); 
		return temp;
	}
	
	
	public String getString() 
	{
		return in.nextLine();
	}
	
	
	/** Venter p� at der tastes ENTER
	 */
	public void waitForEnter()
	{
		String temp;
		do {
		temp = in.next();
		}while (temp != ""); 
	}


}
