package services;

public enum ServiceType  {
	XRAY(150.00), DIAGNOSIS(60.00), BLOODTEST(78.00), ECG(200.40), VACCINE(27.50);

	private final double price;

	private ServiceType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
