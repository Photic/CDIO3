package Tests;

import boundary.Keyboard;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Keyboard in = new Keyboard();
		
		String[] hej = {"Welcome to Menopoly Junior", "Please enter a number of players from 2-6" , "hej"};
		outWithInput(hej);
	}

	public static void outWithInput(String[] a)
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
	
	
}
