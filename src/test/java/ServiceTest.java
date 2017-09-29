import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import services.Service;
import services.Services;

public class ServiceTest {

	@Test
	public void testGetCostBT() throws Exception {
		Service s = new Service(Services.bloodtest, 2);

		assertEquals("bloodtest", s.getService().getname());

		assertEquals(156.0, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostV() throws Exception {
		Service s = new Service(Services.vaccine, 2);

		assertEquals("vaccine", s.getService().getname());

		assertEquals(57.5, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostXR() throws Exception {
		Service s = new Service(Services.xray, 2);

		assertSame("x-ray", s.getService().getname());

		assertEquals(300.0, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostD() throws Exception {
		Service s = new Service(Services.diagnosis, 2);

		assertEquals("diagnosis", s.getService().getname());

		assertEquals(120.0, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostECG() throws Exception {
		Service s = new Service(Services.ecg, 2);

		assertEquals("ecg", s.getService().getname());

		assertEquals(400.8, s.getCostForServiceAmount(), 0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceLessThanZero() throws Exception {
		new Service(Services.ecg, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceisNull() throws Exception {
		new Service(null, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceVaccineLessThanExpected() throws Exception {
		new Service(Services.vaccine, 0);
	}

}
