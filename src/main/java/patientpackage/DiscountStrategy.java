package patientpackage;

abstract class DiscountStrategy {
	private double discountAmount;

	public DiscountStrategy(double discountAmount)
	{
		this.discountAmount = discountAmount;
	}

	double apply(double price, boolean isInsured) {
		return this.applyDiscount(price, isInsured);
	}

	double applyDiscount(double price,  boolean isInsured) {
	    double discountedPrice = price * this.discountAmount;
	    return isInsured ? (discountedPrice * 0.85) : discountedPrice;
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