package lab_10_se;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result = junit.addStrings("Hello","onli");
		assertEquals ("Helloonli", result);

	}

}
