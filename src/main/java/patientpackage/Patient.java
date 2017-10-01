package patientpackage;

import services.MedicalServices;
import services.Service;

public class Patient {

	protected double totalcost = 0.0;

	protected DiscountStratergy discount;

	boolean medicalDiscount;

	Patient(boolean medicalDiscount) {
		this.medicalDiscount = medicalDiscount;
	}

	public void setDiscount(DiscountStratergy discount) {
		this.discount = discount;
	}

	public void addService(Service service) {
		double price = service.getCostForServiceAmount();
		if (service.getService()==MedicalServices.BLOODTEST && medicalDiscount) {
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
