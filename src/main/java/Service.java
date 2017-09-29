import java.util.HashMap;

public class Service {

	private Services service;
	private int amount;
	private HashMap<String, Double> services = JsonParser.fillMap();

	public Service(Services service, int amount) throws Exception {
		if (service == null || amount <= 0) {
			throw new IllegalArgumentException("not a valid argument passed");
		}
		this.amount = amount;
	}

	public double getCostForServiceAmount() {
		double currentCost = 0.0;

		if (services.containsKey(service.getname())) {
			double price = services.get(service.getname());
			currentCost += price;
			double decideAmount = service.getname().equals("vaccine") ? 15.00 : price;
			amount = (decideAmount == 15 ? amount : amount - 1);
			for (int i = 0; i < amount; i++) {
				currentCost += decideAmount;
			}
		}

		return currentCost;
	}

	public Services getService() {
		return service;
	}

}
