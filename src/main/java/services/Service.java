package services;

public class Service {

	private ServiceType  servicetype;
	private int amount;

	public Service(ServiceType servicetype, int amount) {
		if (servicetype == null || amount <= 0) {
			throw new IllegalArgumentException("not a valid argument passed");
		}
		this.servicetype = servicetype;
		this.amount = amount;
	}

	public double getCostForServiceAmount() {
		double currentCost = servicetype.getPrice();
		double decideAmount = (servicetype == ServiceType.VACCINE) ? 15.00 : currentCost;
		amount = (decideAmount == 15 ? amount : amount - 1);
		for (int i = 0; i < amount; i++) {
			currentCost += decideAmount;
		}
		return currentCost;
	}

	public ServiceType getService() {
		return servicetype;
	}

}
