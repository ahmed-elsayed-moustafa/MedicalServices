
public class Over70 extends Patient{

	public Over70() {
		super();

		setDiscount(new Over70Discount());

		setMedicalDiscount(new NoMedicalDiscount());
	}
	
	
	void addService(Service service) {
		double price = service.getCost();
		if (service.getService().equals("bloodtest") && hasMedical.hasDiscount()>0.0) {
			totalcost += 0.0;// 90%+15%= 1.05% so should be free
		} else {
			totalcost += price - (discount.hasDiscount() * price);
		}

	}

}
