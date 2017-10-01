package patientpackage;

import services.ServiceType;

abstract class DiscountStrategy {
	private double discountAmount;
	private boolean isMediHealthInsured;

	public DiscountStrategy(double discountAmount, boolean isMediHealthInsured) {
		this.discountAmount = discountAmount;
		this.isMediHealthInsured = isMediHealthInsured;
	}

	double apply(double price, ServiceType serviceType) {
		double discountedPrice = price * this.discountAmount;
		// Apply 15% extra if insured and for Blood test
		boolean extraDiscountEligible = isMediHealthInsured && serviceType == ServiceType.BLOODTEST;
		discountedPrice = extraDiscountEligible ? (discountedPrice * 0.85) : discountedPrice;
		return discountedPrice;
	}
}

class ChildDiscountStrategy extends DiscountStrategy {

	public ChildDiscountStrategy(boolean isMediHealthInsured) {
		super(0.6, isMediHealthInsured);
	}

}

class OverSeventyDiscountStrategy extends DiscountStrategy {

	public OverSeventyDiscountStrategy(boolean isMediHealthInsured) {
		super(0.1, isMediHealthInsured);
	}

}

class BetweenSixtyFiveSeventyDiscountStrategy extends DiscountStrategy {

	public BetweenSixtyFiveSeventyDiscountStrategy(boolean isMediHealthInsured) {
		super(0.4, isMediHealthInsured);
	}

}

class StandardDiscountStrategy extends DiscountStrategy {

	public StandardDiscountStrategy(boolean isMediHealthInsured) {
		super(1, isMediHealthInsured);
	}
}