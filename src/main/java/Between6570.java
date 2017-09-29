
public class Between6570 extends Patient {

   
	public Between6570(boolean medicalDiscount) {
		super(medicalDiscount);
		setDiscount(new Between6570DiscountStratergy());
	}

}
