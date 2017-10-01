package patientpackage;

abstract class DiscountStrategy {

	double applyDiscount(double price) {
		return 0;
	}
}

class ChildDiscountStrategy extends DiscountStrategy {

	public double applyDiscount(double price) {

		return price * 0.6;
	}

}

class OverSeventyDiscountStrategy extends DiscountStrategy {

	public double applyDiscount(double price) {
		return price * 0.1;
	}

}

class BetweenSixtyFiveSeventyDiscountStrategy extends DiscountStrategy {

	public double applyDiscount(double price) {
		return price * 0.4;
	}

}

class StandardDiscountStrategy extends DiscountStrategy {

	public double applyDiscount(double price) {
		return price - 0;
	}

}
