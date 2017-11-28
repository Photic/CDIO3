package boundary;

import java.util.Scanner;
/** 
 * Implementing inputs from keyboard, using the scanner class.
 *
 */
public class Keyboard{
	private Scanner in;
	
	public Keyboard() {
		in = new Scanner(System.in);
	}
	
	
	/** Wait until the int is inputtet.
	 * @param input
	 * int describing the input to wait for.
	 */
	public void waitForInt(int input)
	{
		int temp = 0;
			do {
				try{temp = in.nextInt();}
				catch (Exception e){	System.out.println("Er det et tal bøv?");}
			}while (!(input==temp)); 
	}
	
	/**
	 * Wait until inputtet integer is between min and max.
	 * @param min
	 * @param max
	 * 
	 * @return
	 * The inputtet integer
	 */
	public int getIntRange(int min, int max)
	{
		int temp = 2;
			do {
				try{temp = in.nextInt();}
				catch(Exception e){System.out.println("Sure that is a number? \nIll pick for you then!"); break;}
			}while (temp<min || temp>max); 
		return temp;
	}
	
	/**
	 * Input a string
	 * @return
	 * The inputtet string
	 */
	public String getString() 
	{
		return in.nextLine();
	}



}
