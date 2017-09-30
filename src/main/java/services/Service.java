package services;

import java.util.HashMap;

public class Service {

	private MedicalServices service;
	private int amount;
	private HashMap<String, Double> services = JsonParser.fillMap();

	public Service(MedicalServices service, int amount) throws Exception {
		if (service == null || amount <= 0) {
			throw new IllegalArgumentException("not a valid argument passed");
		}
		this.service = service;
		this.amount = amount;
	}

	public double getCostForServiceAmount() {
		double currentCost = 0.0;

		if (services.containsKey(service.getName())) {
			double price = services.get(service.getName());
			currentCost += price;
			double decideAmount = service.getName().equals("vaccine") ? 15.00 : price;
			amount = (decideAmount == 15 ? amount : amount - 1);
			for (int i = 0; i < amount; i++) {
				currentCost += decideAmount;
			}
		}

		return currentCost;
	}

	public MedicalServices getService() {
		return service;
	}

}
