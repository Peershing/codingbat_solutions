package map_1;

import java.util.Map;

/*
	Given a map of food keys and topping values, modify and return the map as follows:
	if the key "ice cream" is present, set its value to "cherry". In all cases, set the key
	"bread" to have the value "butter".
*/

public class Topping1 {
	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
		    map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}
}
