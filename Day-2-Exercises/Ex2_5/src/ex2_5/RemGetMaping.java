package ex2_5;
import java.util.*;

public class RemGetMaping {
	public static void main(String args[]) {

		  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		  tree_map.put(10, "Red");
		  tree_map.put(20, "Green");
		  tree_map.put(40, "Black");
		  tree_map.put(50, "White");
		  tree_map.put(60, "Pink");

		  System.out.println("Value before poll: " + tree_map);
		  System.out.println("Value returned: " + tree_map.pollLastEntry());
		  System.out.println("Value after poll: " + tree_map);
		  System.out.println("Value returned: " + tree_map.pollFirstEntry());
		  System.out.println("Value after poll: " + tree_map);
		 }

}
