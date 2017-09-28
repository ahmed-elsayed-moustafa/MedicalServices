import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {

	static HashMap<String, Double> serviceValues = new HashMap<String, Double>();

	public static HashMap fillMap() throws FileNotFoundException, IOException, ParseException {

		if (serviceValues.isEmpty()) {
			return serviceValues = parse(serviceValues);
		}

		return serviceValues;
	}

	static File f = new File(Service.class.getClassLoader().getResource("services.json").getFile());

	protected static HashMap parse(HashMap<String, Double> map)
			throws FileNotFoundException, IOException, ParseException {

		JSONParser jp = new JSONParser();

		Object object = jp.parse(new FileReader(f.getAbsolutePath()));
		JSONObject jso = (JSONObject) object;
		for (Object s : jso.keySet()) {
			JSONObject prices = (JSONObject) jso.get(s);
			Object price = (Double) prices.get("price");
			map.put((String) s, (Double) price);
		}
		return map;
	}

}
