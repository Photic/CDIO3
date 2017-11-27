package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ dieTests.class, RuleBook_Test.class, Test_Gamelogic.class, PlayerTest.class })
public class Suite_AllTests {

}
