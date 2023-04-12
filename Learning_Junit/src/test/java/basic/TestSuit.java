package basic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyTest.class,CalcTest_parameterised.class,CalcTest.class})
public class TestSuit {

}
