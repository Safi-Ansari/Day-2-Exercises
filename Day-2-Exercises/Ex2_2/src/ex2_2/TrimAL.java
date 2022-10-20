package ex2_2;
import java.util.*;

public class TrimAL {
	public static void main(String[] args) 
	 { 

	     ArrayList<Integer> a = new ArrayList<Integer>(10); 

	     a.add(1); 
	     a.add(2); 
	     a.add(3); 
	     a.add(4); 
	     a.add(5); 
	     
	     a.trimToSize(); 

	     System.out.println("List trimmed to" + a.size());

	     System.out.println("The List elements are:" + a); 
	 } 


}
