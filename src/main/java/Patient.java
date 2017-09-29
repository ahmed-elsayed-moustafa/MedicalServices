public class Patient {

	protected double totalcost = 0.0;

	protected DiscountStratergy discount;

	boolean medicalDiscount;

	Patient(boolean medicalDiscount) {
		this.medicalDiscount = medicalDiscount;
	}

	public double getDiscount() {
		return discount.hasDiscount();
	}

	public void setDiscount(DiscountStratergy discount) {
		this.discount = discount;
	}

	void addService(Service service) {
		double price = service.getCostForServiceAmount();
		if (service.getService().getname().equals("bloodtest") && medicalDiscount) {
			totalcost += price - ((discount.hasDiscount() + 0.15 * price));
		} else {
			totalcost += price - (discount.hasDiscount() * price);
		}

	}

	double getTotal() {
		totalcost = Math.round(totalcost * 100);
		totalcost = totalcost / 100;
		return totalcost;
	}
}
