package patientpackage;

public class OverSeventy extends Patient {

	public OverSeventy(boolean medicalDiscount) {
		super(new OverSeventyDiscountStrategy(medicalDiscount));
	}

}
