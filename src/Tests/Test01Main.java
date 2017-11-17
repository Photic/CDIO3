package Tests;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] hej = {"Welcome to Menopoly Junior", "Please enter a number of players from 2-6" , "hej"};
		
		standardOut(hej);
		
		
	}

	public static void standardOut(String[] a)
	{
			System.out.println(" ------------------------------------------------------ ");
			int k = 0;
			
			for (int i = 0; i < a.length; i++) 
			{
				int lengthOfString = 200;
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
