package patientpackage;

import services.Service;
import services.ServiceType;

public class Patient {

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
		totalcost += discount.apply(price, (service.getService() == ServiceType.BLOODTEST && medicalDiscount));
	}

	public double getTotal() {
		totalcost = Math.round(totalcost * 100);
		totalcost /= 100;
		return totalcost;
	}
}
