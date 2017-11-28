package entity;


/**
 * 
 * The die class build up as a die
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
	 * uses math.random to calculate a facevalue between 1 and 6.
	 * @return
	 * Number between 1 and 6.
	 */
	public int rollDie() 
	{	
		return this.faceValue = (int)(Math.random()*dieSize)+1;
	}

	public int getFaceValue() 
	{
		return this.faceValue;
	}

	public String toString() 
	{
		return ""+this.faceValue;		
	}

}