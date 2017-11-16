package boundary;

public class Printer {

	
	public void printer(String[] welcome)
	{
		System.out.println("--------------------------------------------------------");
		int k = 0;
		for (int i = 0; i < welcome.length; i++) {
			for (int j = 0; j < 30; j++) 
			{
				switch (j) {
				case 1:
					System.out.print("|");
					break;
				case 5:
					System.out.print(welcome[k]); k++;
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
	
	public void welcome()
	{
		String[] welcome = {"Welcome","To"};
		printer(welcome);
	}
}
