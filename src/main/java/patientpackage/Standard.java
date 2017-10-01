package patientpackage;

public class Standard extends Patient {

	public Standard(boolean medicalDiscount) {
		super(new StandardDiscountStrategy(medicalDiscount));
	}
}
