
public class Child extends Patient{

	public Child(boolean medicalDiscount) {
		super(medicalDiscount);
		
		setDiscount(new ChildDiscount());
	}

}
