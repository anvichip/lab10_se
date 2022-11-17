package lab_10_se;
import static org.junit.Assert.*;

import org.junit.Test;
public class testAddNumbers {
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.addNumbers(100,200);
		assertEquals (300, result);

	}

}
