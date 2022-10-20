package ex2_7;
import java.util.*;

public class CustomObj {
	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("James Gosling ", " Java");
		myMap.put("Bjourn Stroustup ", " C++");
		myMap.put("Denish Ritche ", " C");

		System.out.println(myMap);

		myMap.forEach((key, value) -> System.out.println(key + " => " + value));

	}


}
