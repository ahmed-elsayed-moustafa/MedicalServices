
public class Standard extends Patient{

	public Standard(boolean medicalDiscount) {
		super(medicalDiscount);
		
		setDiscount(new StandardDiscountStratergy());
	}

}
