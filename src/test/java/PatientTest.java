import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import patientpackage.Between6570;
import patientpackage.Child;
import patientpackage.Over70;
import patientpackage.Patient;
import patientpackage.Standard;
import services.Service;
import services.Services;

public class PatientTest {

	@Test
	public void test6070Insurance() throws Exception {
		Patient p = new Between6570(true);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 0.75= 58.50: 
		 * 2) 78-58.50= 19.50
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.60=34.5 
		 * 2) 57.50-34.5=23
		 * 
		 * 19.50+23=42.5
		 */

		assertEquals(42.5, price, 0);
	}

	@Test
	public void testOver70Insurance() throws Exception {
		Patient p = new Over70(true);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 1.05= 81.9 so cost is free. Over 100% discount
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.90=51.75 2) 57.50-51.75.5=5.75
		 * 
		 * 0+5.75=42.5
		 */

		assertEquals(5.75, price, 0);

	}

	@Test
	public void testUnder5Insurance() throws Exception {
		Patient p = new Child(true);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 0.55= 42.9 2) 78-42.9=35.1
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.40=23 2) 57.50-23=34.5
		 * 
		 * 34.5+34.1=69.6
		 */

		assertEquals(69.6, price, 0);
	}

	@Test
	public void testStandardInsurance() throws Exception {
		Patient p = new Standard(true);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));
		
		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 0.15= 11.7 
		 * 2) 78 - 11.7 = 66.3
		 * 
		 * 1) Vaccine= (27.50+30) 57.5
		 * 
		 * 66.3 + 57.5 = 123.8
		 */

		assertEquals(123.8, price, 0);
	}

	@Test
	public void test6070NoInsurance() throws Exception {
		Patient p = new Between6570(false);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 0.60 = 46.8 2) 78-46.8= 31.2
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.60=34.5 2) 57.50-34.5=23
		 * 
		 * 31.2+23=54.2
		 */

		assertEquals(54.2, price, 0);
	}

	@Test
	public void testOver70NoInsurance() throws Exception {
		Patient p = new Over70(false);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();
		/**
		 * 1) Blood test= 78 * 90= 70.2 78-70.2=7.8
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.90=51.75 2) 57.50-51.75.5=5.75
		 * 
		 * 7.8+5.75=13.55
		 */

		assertEquals(13.55, price, 0);

	}

	@Test
	public void testUnder5NoInsurance() throws Exception {
		Patient p = new Child(false);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 * 0.40= 31.2 2) 78-31.2=46.8
		 * 
		 * 1) Vaccine= (27.50+30)57.5*0.40=23 2) 57.50-23=34.5
		 * 
		 * 34.5+46.8=81.3
		 */

		assertEquals(81.3, price, 0);
	}

	@Test
	public void testStandardNoInsurance() throws Exception {
		Patient p = new Standard(false);
		p.addService(new Service(Services.bloodtest, 1));
		p.addService(new Service(Services.vaccine, 2));

		double price = p.getTotal();

		/**
		 * 1) Blood test= 78 = 78 2) 78 - 11.7 = 66.3
		 * 
		 * 1) Vaccine= (27.50+30) 57.5
		 * 
		 * 78 + 57.5 = 135.5
		 */

		assertEquals(135.5, price, 0);
	}
}
