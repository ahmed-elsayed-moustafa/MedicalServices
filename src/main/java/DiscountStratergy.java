
public interface DiscountStratergy {

	double hasDiscount();
}


class ChildDiscountStratergy implements DiscountStratergy {

	public double hasDiscount() {
		
		return 0.4;
	}
	
}

class Over70DiscountStratergy implements DiscountStratergy{

	public double hasDiscount() {
		
		return 0.9;
	}
	
}

class Between6570DiscountStratergy implements DiscountStratergy{

	public double hasDiscount() {
		
		return 0.6;
	}
	
}

class StandardDiscountStratergy implements DiscountStratergy {

	public double hasDiscount() {
		
		return 0.0;
	}
	
}

