import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_kdreid_0018{
    
    
    /**
     * q1: Write a public static method named q1 that takes a HashMap with Strings as keys and 
     * Strings as values as a parameter and returns a single String. The String returned will be 
     * the concatenation of the Strings "size", "suspect", and "reservation" followed by all of 
     * the keys from the input HashMap. Each String concatenated into the return String must be 
     * separated by a single space
     */
	public static String q1(HashMap<String, String> inputList) {
		String x = "";
		for(int i=0; i<inputList.size() ;i++) {
		 x = "size" +" "+ "suspect" + " "+ "reservation"+ inputList.keySet();
		}String y= x.replaceAll(",","").replace('[', ' ').replaceAll("]","");
		return y;
	}
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain all 
     * values from the input ArrayList except those that have a cube within 3540.0 of 535023.78 
     * (ie. the target value of the cube is 535023.78 and the allowed variance from this target 
     * is 3540.0)
     */
	public static ArrayList<Double> q2(ArrayList<Double> inputList) {
    	ArrayList<Double> newList = new ArrayList<Double>();
    	for(int i=0; i<inputList.size() ;i++) {
    		if(Math.pow(inputList.get(i),3)<3540 && Math.pow(inputList.get(i),3)>538563.78) {
    			continue;
    		}newList.add((inputList.get(i)));
    	}
    return newList;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a HashMap 
     * of Integers to Doubles. The returned HashMap should contain all the integers from 28 to 63 
     * as keys mapping to their cube root as values. The output should be inclusive of the end 
     * points
     */
	public static HashMap<Integer, Double> q3() {
    	HashMap<Integer, Double> newMap = new HashMap<Integer, Double>();
    	for(int x = 28; x <= 63; x++ ) {
    		newMap.put(x, Math.pow(x, 3));
    	}
    	System.out.print(newMap);
    	return newMap;
	}
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns void. The 
     * method should print all the integers from 11 to 70 to the screen. The output should be 
     * inclusive of these end points
     */
	public static void q4() {
		int x = 11;
		while(x<=70){
		System.out.print(x + " ");
		x = x + 1;
		}
	}
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 4 characters, return "short"
     * If the input String has 4 or more characters but less than 6, return "medium"
     * If the input String has greater than or equal to 6 characters, return "long"
     * If the input String contains any instances of the letter 'p', return "found p" regardless 
     * of the length of the input
     */
	public static String q5(String input) {
    	boolean test1 = input.contains("p");
    	int test2 = input.length();
    	String x;
    	if(test1) {
    		x = "found p";
    	}else if(test2 == 0) {
    		x = "empty";
    	}else if(test2 < 4) {
    		x = "short";
    	} else if(test2 < 6) {
    		x = "medium";
    	} else {
    		x = "long";
    	}
    return x;
    }
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
