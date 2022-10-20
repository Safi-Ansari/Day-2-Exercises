package ex2_1;

import java.util.*;

public class Ex2_1 {
	public static void main(String[] args) {
		  
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		System.out.println(a);
		
		System.out.println("Retrieving 40...it's at" + a.indexOf(40) + "index");
		
		System.out.println("Updating to 60");

		a.set(40, 60);

		// Print the list again
		System.out.println("Updated List: "+ a);
		}
}
