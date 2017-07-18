
public interface MedicalInsurance {

	double hasDiscount();
}


class HasMedicalDiscount implements  MedicalInsurance{

	public double hasDiscount() {
		
		return 0.15;
	}
	
}


class  NoMedicalDiscount implements MedicalInsurance {

	public double hasDiscount() {
		
		return 0.0;
	}
	
}
