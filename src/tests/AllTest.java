package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DieTests.class, RuleBook_Test.class, Test_Gamelogic.class, PlayerTest.class, TerritoryTest.class, OutTest.class})
public class AllTest {
	/**
	 * Skal bruges til at starte JUnit.
	 */
}
