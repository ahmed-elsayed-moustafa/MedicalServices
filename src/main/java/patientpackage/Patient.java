package patientpackage;

import services.Service;

public class Patient {

	protected double totalcost = 0.0;

	protected DiscountStratergy discount;

	boolean medicalDiscount;

	Patient(boolean medicalDiscount) {
		this.medicalDiscount = medicalDiscount;
	}

	public double getDiscount() {
		return discount.discountValue();
	}

	public void setDiscount(DiscountStratergy discount) {
		this.discount = discount;
	}

	public void addService(Service service) {
		double price = service.getCostForServiceAmount();
		System.out.println(service.getService().getname() + " " + price);
		if (service.getService().getname().equals("bloodtest") && medicalDiscount) {
			double calculatedCost = (price - ((discount.discountValue() + 0.15) * price));
			totalcost += calculatedCost < 0.0 ? 0.0 : calculatedCost;
		} else {
			totalcost += price - (discount.discountValue() * price);
		}

	}

	public double getTotal() {
		totalcost = Math.round(totalcost * 100);
		totalcost /= 100;
		return totalcost;
	}
}
