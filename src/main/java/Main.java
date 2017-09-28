import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Patient p = new Child(false);

		p.addService(new Service(Services.vaccine, 1));
		p.addService(new Service(Services.xray, 1));

		System.out.println(p.getTotal());

	}

}
