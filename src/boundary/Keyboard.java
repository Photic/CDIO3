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

	
	/** Venter p� en int. Returnerer f�rst n�r brugeren indtaster den int der ventes p�
	 * @param ind int der ventes p�
	 */
	public void waitForInt(int ind){
		int temp;
			do {
			temp = in.nextInt();
			}while (!(ind==temp)); 
	}
	
	public int getIntRange(int min, int max){
		int temp;
			do {
			temp = in.nextInt();
			}while (temp<min || temp>max); 
		return temp;
	}
	
	
	/** Venter p� at der tastes ENTER
	 */
	public void waitForEnter(){
		in.nextLine();
	}
}
