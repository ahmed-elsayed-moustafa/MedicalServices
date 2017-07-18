
public class Child extends Patient{

	public Child() {
		super();
		
		setDiscount(new ChildDiscount());
		
		setMedicalDiscount(new NoMedicalDiscount());
	}

}
