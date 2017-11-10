package monopoly_junior;


/**
 * 
 * Dette er Terning klassen.
 * Terningklassen har, foruden en konstruktør, følgende metoder:
 * rulTerning(), getØjne() og toString().
 * @author mathias
 *
 */

public class Die {

	private int faceValue;
	private int dieSize = 6;

	public Die() 
	{

	}



	/**
	 * 
	 * rollDie() bruger Math klassen til at returnere et tilfældigt nummer mellem 1 og 6.
	 * @return
	 * Number between 1 and 6.
	 */

	public int rollDie() 
	{	
		return this.faceValue = (int)(Math.random()*dieSize)+1;
	}


	
	
	
	//-----------------------------------------------------------------------------------------------------	
	//	Dette er get-metoden.
	//-----------------------------------------------------------------------------------------------------
	public int getFaceValue() 
	{
		return this.faceValue;
	}



	//-----------------------------------------------------------------------------------------------------	
	//	Dette er toString() metoden.
	//-----------------------------------------------------------------------------------------------------
	public String toString() 
	{
		return ""+this.faceValue;		
	}

}