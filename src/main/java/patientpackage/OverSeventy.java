package patientpackage;

public class OverSeventy extends Patient {

	public OverSeventy(boolean isMediHealthInsured) {
		super(new OverSeventyDiscountStrategy(isMediHealthInsured));
	}

}
