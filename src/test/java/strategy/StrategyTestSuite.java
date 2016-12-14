package strategy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	MarshallTest.class,
	RunnerTest.class,
	SwimmerTest.class,
	CyclistTest.class,
	TriathleteTest.class
})

public class StrategyTestSuite {

}
