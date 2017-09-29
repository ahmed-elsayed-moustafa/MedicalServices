package patientpackage;

public class Over70 extends Patient {

	public Over70(boolean medicalDiscount) {

		super(medicalDiscount);

		setDiscount(new Over70DiscountStratergy());
	}

}
