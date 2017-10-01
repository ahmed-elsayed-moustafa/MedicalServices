package patientpackage;

abstract class DiscountStrategy {
	private double discountAmount;

	public DiscountStrategy(double discountAmount)
	{
		this.discountAmount = discountAmount;
	}

	double applyDiscount(double price) {
		return price * this.discountAmount;
	}
}

class ChildDiscountStrategy extends DiscountStrategy {

	public ChildDiscountStrategy() {
		super(0.6);
	}

}

class OverSeventyDiscountStrategy extends DiscountStrategy {

	public OverSeventyDiscountStrategy() {
		super(0.1);
	}

}

class BetweenSixtyFiveSeventyDiscountStrategy extends DiscountStrategy {

	public BetweenSixtyFiveSeventyDiscountStrategy() {
		super(0.4);
	}

}

class StandardDiscountStrategy extends DiscountStrategy {

	public StandardDiscountStrategy() {
		super(1);
	}
}