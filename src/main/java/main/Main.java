package main;

import patientpackage.Child;
import patientpackage.Patient;
import services.Service;
import services.ServiceType;

public class Main {

	public static void main(String[] args) throws Exception {

		Patient p = new Child(false);

		p.addService(new Service(ServiceType.VACCINE, 1));
		p.addService(new Service(ServiceType.XRAY, 1));

		System.out.println(p.getTotal());
		
	}
}
