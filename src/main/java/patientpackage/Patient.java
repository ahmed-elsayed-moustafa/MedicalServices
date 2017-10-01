package patientpackage;

import services.Service;

public class Patient {

	private double totalcost = 0.0;

	private DiscountStrategy discount;

	Patient(DiscountStrategy discount) {
		this.discount=discount;
	}

	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}

	public void addService(Service service) {
		double price = service.getCostForServiceAmount();
		totalcost += discount.apply(price, service.getService());
	}

	public double getTotal() {
		totalcost = Math.round(totalcost * 100);
		totalcost /= 100;
		return totalcost;
	}
}
