package lab_10_se;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testAddNumbers.class, testAddString.class })
public class AllTests {

}
