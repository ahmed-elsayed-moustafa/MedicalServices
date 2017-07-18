import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

public class ServiceTest {

	@Test
	public void testGetCostBT() throws FileNotFoundException, IOException, ParseException {
		Service s = new Service("blood test", 2);

		assertEquals("bloodtest", s.getService());

		assertEquals(156.0, s.getCost(), 0);

	}

	@Test
	public void testGetCostV() throws FileNotFoundException, IOException, ParseException {
		Service s = new Service("vaccine", 2);

		assertEquals("vaccine", s.getService());

		assertEquals(57.5, s.getCost(), 0);

	}

	@Test
	public void testGetCostXR() throws FileNotFoundException, IOException, ParseException {
		Service s = new Service("x-ray", 2);

		assertSame("x-ray", s.getService());

		assertEquals(300.0, s.getCost(), 0);

	}

	@Test
	public void testGetCostD() throws FileNotFoundException, IOException, ParseException {
		Service s = new Service("Diagnosis", 2);

		assertEquals("diagnosis", s.getService());

		assertEquals(120.0, s.getCost(), 0);

	}

	@Test
	public void testGetCostECG() throws FileNotFoundException, IOException, ParseException {
		Service s = new Service("ECG", 2);

		assertEquals("ecg", s.getService());

		assertEquals(400.8, s.getCost(), 0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceLessThanZero() throws FileNotFoundException, IOException, ParseException {
		new Service("ECG", -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceLengthZero() throws FileNotFoundException, IOException, ParseException {
		new Service("", -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceisNull() throws FileNotFoundException, IOException, ParseException {
		new Service(null, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceVaccineLessThanExpected() throws FileNotFoundException, IOException, ParseException {
		new Service("vaccine", 0);
	}

}
