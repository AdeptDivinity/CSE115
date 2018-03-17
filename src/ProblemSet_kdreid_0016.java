import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_kdreid_0016{
    
    
    /**
     * q1: Write a public static method named q1 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a square root within 5.0 of 0.09 (ie. the 
     * difference of the square root and 0.09 is less than 5.0)
     */
    public static ArrayList<Double> q1(ArrayList<Double> inputList) {
    	ArrayList<Double> newList = new ArrayList<Double>();
    	for(int i=0; i<inputList.size() ;i++) {
    		if(Math.sqrt(inputList.get(i))>=5.09) {
    			continue;
    		}newList.add((inputList.get(i)));
    	}
    return newList;
    }
    
    		
    	
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 2 characters, return "short"
     * If the input String has 2 or more characters but less than 8, return "medium"
     * If the input String has greater than or equal to 8 characters, return "long"
     * If the input String contains any instances of the letter 't', return "found t" regardless 
     * of the length of the input
     */
    public static String q2(String input) {
    	boolean test1 = input.contains("t");
    	int test2 = input.length();
    	String x;
    	if(test1) {
    		x = "found t";
    	}else if(test2 == 0) {
    		x = "empty";
    	}else if(test2 < 2) {
    		x = "short";
    	} else if(test2 < 8) {
    		x = "medium";
    	} else {
    		x = "long";
    	}
    return x;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is not equal to 10 or the second parameter is less than 6
     */
    
    public static boolean q3(int x, int y) {
    	boolean xcomp = x != 10;
    	boolean ycomp = y < 6;
    	return xcomp || ycomp;
    }
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a HashMap 
     * of Integers to Doubles. The returned HashMap should contain all the integers from 16 to 38 
     * as keys mapping to their square root as values. The output should be inclusive of the end 
     * points
     */
    public static HashMap<Integer, Double> q4() {
    	HashMap<Integer, Double> newMap = new HashMap<Integer, Double>();
    	for(int x = 16; x <= 38; x++ ) {
    		newMap.put(x, Math.sqrt(x));
    	}
    	System.out.print(newMap);
    	return newMap;
	}
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 17, 2, 6, 7, and 9. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
public static int q5(ArrayList<Integer> inputList) {
        return inputList.get(17) + inputList.get(2) + inputList.get(6) + inputList.get(7) + inputList.get(9);
          }
    
    
    
    public static void main(String[] args){
    	ArrayList<Double> x = new ArrayList<Double>();
    	 x.add(6.38);
         x.add(62.42);
         x.add(9.81);
         x.add(4.9);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(1000.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(4.0);
         x.add(1000.0);
        ArrayList<Double> y = q1(x);
     	System.out.println(y); 
     	q4();
        /* Test your code here to verify it is correct before submitting */
        
    }
}
