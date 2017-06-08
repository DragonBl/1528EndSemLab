import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TvTest {
	
	Tv tele;
	boolean tvPower;

	@Before
	public void setUp() throws Exception {
		tele = new Tv(50,100);
	}

	@Test
	public void testPowerOnOff() {
		//fail("Not yet implemented");
		tvPower = true;
		assertEquals(tvPower,tele.powerOnOff());
	}

	@Test
	public void testToggleUp() {
		//fail("Not yet implemented");
		int x = 100;
		assertEquals(x,tele.ToggleUp());
	}

	@Test
	public void testToggleDown() {
		//fail("Not yet implemented");
		int y = 100;
		assertEquals(y,tele.ToggleDown());
	}

}
