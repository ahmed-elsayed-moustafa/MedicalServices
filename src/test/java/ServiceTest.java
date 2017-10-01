import static org.junit.Assert.*;

import org.junit.Test;
import services.MedicalServices;
import services.Service;

public class ServiceTest {

	@Test
	public void testGetCostBT() throws Exception {
		Service s = new Service(MedicalServices.BLOODTEST, 2);

		assertEquals(156.0, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostV() throws Exception {
		Service s = new Service(MedicalServices.VACCINE, 2);

		assertEquals(57.5, s.getCostForServiceAmount(), 0);

	}

	@Test
	public void testGetCostXR() throws Exception {
		Service s = new Service(MedicalServices.XRAY, 2);

		
		assertEquals(300.0, s.getCostForServiceAmount(), 0);
	}

	@Test
	public void testGetCostD() throws Exception {
		Service s = new Service(MedicalServices.DIAGNOSIS, 2);

		assertEquals(120.0, s.getCostForServiceAmount(), 0);
	}

	@Test
	public void testGetCostECG() throws Exception {
		Service s = new Service(MedicalServices.ECG, 2);

		
		assertEquals(400.8, s.getCostForServiceAmount(), 0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceLessThanZero() throws Exception {
		new Service(MedicalServices.ECG, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceisNull() throws Exception {
		new Service(null, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void serviceVaccineLessThanExpected() throws Exception {
		new Service(MedicalServices.VACCINE, 0);
	}

}
