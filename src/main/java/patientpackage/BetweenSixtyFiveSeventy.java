package patientpackage;

public class BetweenSixtyFiveSeventy extends Patient {

	public BetweenSixtyFiveSeventy(boolean medicalDiscount) {
		super(new BetweenSixtyFiveSeventyDiscountStrategy(medicalDiscount));
	}

}
