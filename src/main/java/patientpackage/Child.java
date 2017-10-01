package patientpackage;

public class Child extends Patient {

	public Child(boolean isMediHealthInsured) {
		super(new ChildDiscountStrategy(isMediHealthInsured));
	}

}
