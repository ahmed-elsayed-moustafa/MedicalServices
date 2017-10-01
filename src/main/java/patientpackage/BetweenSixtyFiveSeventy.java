package patientpackage;

public class BetweenSixtyFiveSeventy extends Patient {

	public BetweenSixtyFiveSeventy(boolean isMediHealthInsured) {
		super(new BetweenSixtyFiveSeventyDiscountStrategy(isMediHealthInsured));
	}

}
