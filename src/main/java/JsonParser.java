import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {

	protected static HashMap<String, Double> serviceValues = new HashMap<String, Double>();
	private File directory;
	
	public JsonParser(File directory) throws FileNotFoundException, IOException, ParseException {
		this.directory = directory;
		parse();
	}

	private void parse() throws FileNotFoundException, IOException, ParseException {
		
		JSONParser jp = new JSONParser();

		Object object = jp.parse(new FileReader(directory.getAbsolutePath()));
		JSONObject jso = (JSONObject) object;
		for (Object s : jso.keySet()) {
			JSONObject prices= (JSONObject) jso.get(s);
			Object price = (Double) prices.get("price");
			serviceValues.put((String) s, (Double)price);
		}
	}
}
