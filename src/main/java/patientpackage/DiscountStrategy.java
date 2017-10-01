package patientpackage;

public interface DiscountStratergy {

	double discountValue();
}

class ChildDiscountStratergy implements DiscountStratergy {

	public double discountValue() {

		return 0.4;
	}

}

class OverSeventyDiscountStratergy implements DiscountStratergy {

	public double discountValue() {

		return 0.9;
	}

}

class BetweenSixtyFiveSeventyDiscountStratergy implements DiscountStratergy {

	public double discountValue() {

		return 0.6;
	}

}

class StandardDiscountStratergy implements DiscountStratergy {

	public double discountValue() {

		return 0.0;
	}

}
