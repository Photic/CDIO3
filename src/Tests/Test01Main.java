package Tests;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] hej = {"Welcome to Menopoly Junior", "Please enter a number of players from 2-6"};
		
		standardOut(hej);
		
		
	}

	public static void standardOut(String[] a)
	{
			System.out.println(" ------------------------------------------------------ ");
			int k = 0;
			
			for (int i = 0; i < a.length; i++) 
			{
				int lengthOfString = 60;
				for (int j = 0; j < lengthOfString; j++) 
				{
					switch (j) {
					case 1:
						System.out.print("|");
						break;
					case 5:
						System.out.print(a[k]); k++;
						lengthOfString -= a[k].length();
						break;
					case 29:
						System.out.print("|");
						break;
					default:
						System.out.print(" ");
						break;
					}
				}
				System.out.println("");
			}
			
	}
	
	
}
