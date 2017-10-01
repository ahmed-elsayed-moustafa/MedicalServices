package patientpackage;

public class Standard extends Patient {

	public Standard(boolean isMediHealthInsured) {
		super(new StandardDiscountStrategy(isMediHealthInsured));
	}
}
