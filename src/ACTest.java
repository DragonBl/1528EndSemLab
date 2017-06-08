import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ACTest {
	
	AC ac;
	boolean test;

	@Before
	public void setUp() throws Exception {
		ac = new AC(35);
	}

	@Test
	public void testPowerOnOff() {
		//fail("Not yet implemented");
		test = true;
		assertEquals(test,ac.powerOnOff());
	}

	@Test
	public void testToggleUp() {
		//fail("Not yet implemented");
		int x = 35;
		assertEquals(x,ac.ToggleUp());
	}

	@Test
	public void testToggleDown() {
		//fail("Not yet implemented");
		int z = 15;
		assertEquals(z,ac.ToggleDown());
	}

}
