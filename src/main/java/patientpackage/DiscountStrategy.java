package patientpackage;

public interface DiscountStrategy {

	double discountValue();
}

class ChildDiscountStrategy implements DiscountStrategy {

	public double discountValue() {

		return 0.4;
	}

}

class OverSeventyDiscountStrategy implements DiscountStrategy {

	public double discountValue() {

		return 0.9;
	}

}

class BetweenSixtyFiveSeventyDiscountStrategy implements DiscountStrategy {

	public double discountValue() {

		return 0.6;
	}

}

class StandardDiscountStrategy implements DiscountStrategy {

	public double discountValue() {

		return 0.0;
	}

}
