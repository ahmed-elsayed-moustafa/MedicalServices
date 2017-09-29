package main;

import patientpackage.Child;
import patientpackage.Patient;
import services.Service;
import services.Services;

public class Main {

	public static void main(String[] args) throws Exception {

		Patient p = new Child(false);

		p.addService(new Service(Services.vaccine, 1));
		p.addService(new Service(Services.xray, 1));

		System.out.println(p.getTotal());
	}

}
