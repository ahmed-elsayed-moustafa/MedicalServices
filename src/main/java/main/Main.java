package main;

import patientpackage.Child;
import patientpackage.Patient;
import services.MedicalServices;
import services.Service;

public class Main {

	public static void main(String[] args) throws Exception {

		Patient p = new Child(false);

		p.addService(new Service(MedicalServices.VACCINE, 1));
		p.addService(new Service(MedicalServices.XRAY, 1));

		System.out.println(p.getTotal());
		
	}
}
