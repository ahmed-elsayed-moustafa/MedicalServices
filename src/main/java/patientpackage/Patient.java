package patientpackage;

import services.Service;
import services.ServiceType;

public class Patient {

	static class MediHealthPatient {

		public static double applyDiscount(double price, DiscountStrategy discount) {
			double preMediHealth = discount.applyDiscount(price);
			return preMediHealth * 0.85;
		}
	}

	private double totalcost = 0.0;

	private DiscountStrategy discount;

	private boolean medicalDiscount;

	Patient(boolean medicalDiscount) {
		this.medicalDiscount = medicalDiscount;
	}

	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}

	public void addService(Service service) {
		double price = service.getCostForServiceAmount();
		if (service.getService() == ServiceType.BLOODTEST && medicalDiscount) {
			totalcost += MediHealthPatient.applyDiscount(price, discount);
		} else {
			totalcost += discount.applyDiscount(price);
		}

	}

	public double getTotal() {
		totalcost = Math.round(totalcost * 100);
		totalcost /= 100;
		return totalcost;
	}
}
