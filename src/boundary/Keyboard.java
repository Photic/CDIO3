package boundary;

import java.awt.event.KeyEvent;
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

	public void keyPressed(KeyEvent event) {
	    switch (event.getKeyCode()) {
	        case KeyEvent.VK_UP:
	            System.out.println("OH YA");
	            break;
	        case KeyEvent.VK_DOWN:
	            // down arrow
	            break;
	        case KeyEvent.VK_RIGHT:
	            // right arrow
	            break;
	        case KeyEvent.VK_LEFT:
	            // left arrow
	            break;
	    }
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
