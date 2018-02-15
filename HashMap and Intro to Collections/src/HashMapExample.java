import java.util.HashMap;
import java.util.Map;

/**
 * Using a Map
 * @author CSC 143
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
		// Map is an interface that describes a collection
		// of (key, value) pairs
		// e.g. to store cities and their area codes
		// if using an int, use its wrapper type Integer
		Map<String, Integer> areaCodes = new HashMap<String, Integer>();
		String[] cities = {"Seattle", "Bellevue", "Tacoma", "New-York"};
		int[] codes = {206, 425, 253, 212};
		for (int i = 0; i < cities.length; i ++) {
			// codes[i] is automatically packaged into an Integer (boxing)
			areaCodes.put(cities[i], codes[i]);
		}
		
		// to print the map
		// directly {Seattle=206, Bellevue=425...
		System.out.println("areaCodes = " + areaCodes);
		// via a loop
		for (String city : areaCodes.keySet()) {
			int code = areaCodes.get(city);
			System.out.printf("%s has area code %d\n", city, code);
		}
	}

}







