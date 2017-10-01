package services;

public class Service {

	private MedicalServices service;
	private int amount;

	public Service(MedicalServices service, int amount) {
		if (service == null || amount <= 0) {
			throw new IllegalArgumentException("not a valid argument passed");
		}
		this.service = service;
		this.amount = amount;
	}

	public double getCostForServiceAmount() {
		double currentCost = service.getPrice();
		double decideAmount = (service == MedicalServices.VACCINE) ? 15.00 : currentCost;
		amount = (decideAmount == 15 ? amount : amount - 1);
		for (int i = 0; i < amount; i++) {
			currentCost += decideAmount;
		}
		return currentCost;
	}

	public MedicalServices getService() {
		return service;
	}

}
