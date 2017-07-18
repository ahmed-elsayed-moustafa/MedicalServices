
public interface Discount {

	double hasDiscount();
}


class ChildDiscount implements Discount{

	public double hasDiscount() {
		
		return 0.4;
	}
	
}

class Over70Discount implements Discount{

	public double hasDiscount() {
		
		return 0.9;
	}
	
}

class Between6570Discount implements Discount{

	public double hasDiscount() {
		
		return 0.6;
	}
	
}

class StandardDiscount implements Discount{

	public double hasDiscount() {
		
		return 0.0;
	}
	
}

