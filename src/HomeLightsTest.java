import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeLightsTest {
	
	HomeLights lights;
	boolean lightPower;

	@Before
	public void setUp() throws Exception {
		lights = new HomeLights();
	}

	@Test
	public void testPowerOnOff() {
		//fail("Not yet implemented");
		lightPower = true;
		assertEquals(lightPower,lights.powerOnOff());
	}

	@Test
	public void testToggleUp() {
		//fail("Not yet implemented");
	}

	@Test
	public void testToggleDown() {
		//fail("Not yet implemented");
	}

}
