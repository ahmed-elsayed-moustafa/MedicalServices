import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.ParseException;

public class Service {

	private String service;
	private int amount;
	private HashMap<String, Double> services = JsonParser.serviceValues;

	public Service(String service, int amount) throws FileNotFoundException, IOException, ParseException {
		if (service == null || service.length()==0 || amount <= 0) {
			throw new IllegalArgumentException("not a valid argument passed");
		}

		if (services.size() == 0) {
			new JsonParser(new File(Service.class.getClassLoader().getResource("services.json").getFile()));
		}

		this.service = service.replace(" ", "").toLowerCase().trim();
		this.amount = amount;
	}

	public double getCost() {
		double currentCost = 0.0;

		if (services.containsKey(service)) {
			double price = services.get(service);
			currentCost += price;
			double decideAmount = service.equals("vaccine") ? 15.00 : price;
			amount = (decideAmount == 15 ? amount : amount - 1);
			for (int i = 0; i < amount; i++) {
				currentCost += decideAmount;
			}
		}

		return currentCost;
	}

	public String getService() {
		return service;
	}

}
