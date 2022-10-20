package ex2_4;
import java.util.*;

public class CountOccurance {
	
	public static void main(String[] args) {
		
	      String str = "dgdfgdfhdfsdfsdfdgdfhgfjghjgfhjghjgfghdfgdfgsdfsdcfdfgfgnmfzsdfdfdffffsdfsddasdsghjhgg";
	      
	      System.out.println("String: " + str);
	      
	      HashMap <Character, Integer> hashMap = new HashMap<>();
	      
	      for (int i = 0; i <= str.length()-1; i++) {
	    	  
	         if (hashMap.containsKey(str.charAt(i))) {
	        	 
	            int count = hashMap.get(str.charAt(i));
	            
	            hashMap.put(str.charAt(i), ++count);
	            
	         } 
	         
	         else {
	        	 
	            hashMap.put(str.charAt(i),1);
	         }
	      }
	      
	      System.out.println("Each charecter occurance: " + hashMap);
	   }


}
