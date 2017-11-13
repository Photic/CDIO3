package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import monopoly_junior.Die;

public class dieTests 
{

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void roll10000Times() 
	{
		Die d1 = new Die();


		for (int i=0;i<10000;i++) 
		{
			d1.rollDie();
		}

		boolean test = d1.getFaceValue()>=1 && d1.getFaceValue()<=6;

		assertTrue(test);
	}
	
	@Test
	public void dieNotEqualsOne(){
		Die d1 = new Die();
		Die d2 = new Die();
		int total;
		boolean notOne = true;
		
		for (int i =0; i<10000;i++){
			total = d1.rollDie()+d2.rollDie();
			if (total==1){
				notOne = false;
				break;
			}
		}
		assertTrue(notOne);
	}
	
	
	@Test
	public void ensKast() {

		Die d1 = new Die();
		Die d2 = new Die();
		


		int i, d1roll, d2roll; 
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0; 

		for (i = 0; i < 72000; i++) {

			d1roll = d1.rollDie(); 
			d2roll = d2.rollDie(); 


			if (d1roll == d2roll && d1roll == 1) {
				one ++;
			}
			else if (d1roll == d2roll && d1roll == 2) {
				two ++;
			}
			else if (d1roll == d2roll && d1roll == 3) {
				three ++; 
			}
			else if (d1roll == d2roll && d1roll == 4) {
				four ++;
			}
			else if (d1roll == d2roll && d1roll == 5) {
				five ++; 
			}
			else if (d1roll == d2roll && d1roll == 6) {
				six ++;
			}

		}
		
		int sum = one + two + three + four + five + six; 
		System.out.println(sum);

		boolean actual = one <= 2000+150 && one >= 2000-150 
				&& two <= 2000+150 && two >= 2000-150
				&& three <= 2000+150 && three >= 2000-150
				&& four <= 2000+150 && four >= 2000-150
				&& five <= 2000+150 && five >= 2000-150
				&& six <= 2000+150 && six >= 2000-150;  

				assertTrue(actual);
		
	}
	
	
}
