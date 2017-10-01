package patientpackage;

public class BetweenSixtyFiveSeventy extends Patient {

	public BetweenSixtyFiveSeventy(boolean medicalDiscount) {
		super(medicalDiscount);
		
		setDiscount(new Between6570DiscountStratergy());
	}

}
