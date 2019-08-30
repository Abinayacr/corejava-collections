package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String, String> mapCountryCodes=new HashMap<>();
	mapCountryCodes.put("1", "USA");
	mapCountryCodes.put("44", "UK");
	mapCountryCodes.put("33", "France");
	mapCountryCodes.put("81", "Japan");
	Set<String> setCodes=mapCountryCodes.keySet();
	Iterator<String> iterator=setCodes.iterator();
	
	while(iterator.hasNext()) {
		String code=iterator.next();
		String country=mapCountryCodes.get(code);
		System.out.println(code+"=>"+country);
		}
	System.out.println(mapCountryCodes.get("44"));
	}
}
