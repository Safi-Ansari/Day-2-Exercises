package ex2_6;
import java.util.*;

public class RRFirstEle {
	public static void main(String[] args) {
		
		TreeSet <Integer> mySet = new TreeSet<Integer>();
	   
		mySet.add(10);
		mySet.add(30);
		mySet.add(50);
		mySet.add(40);
		mySet.add(20);
	 
		System.out.println("Tree set: "+mySet);
		System.out.println("Removing first(lowest) element: "+mySet.pollFirst());
		System.out.println("Updated Tree set: "+mySet);
	 }


}
