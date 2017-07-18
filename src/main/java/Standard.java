
public class Standard extends Patient{

	public Standard() {
		super();
		
		setDiscount(new StandardDiscount());

		setMedicalDiscount(new NoMedicalDiscount());
	}

}
