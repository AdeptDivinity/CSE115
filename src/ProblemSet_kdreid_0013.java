import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_kdreid_0013{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a new 
     * HashMap with keys of type Integer mapped to values of type Integer containing the 
     * key-value pairs {22:20, 71:11, 71:14, 36:33}
     */
    public static HashMap<Integer, Integer> q1() {
    	HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
    	System.out.println();
    	x.put(22, 20);
    	x.put(71, 11);
    	x.put(71, 14);
    	x.put(36, 33);
    	System.out.println(x);
    	return x;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns an 
     * ArrayList of type Double containing the values 11.36, 9.47, and -2.39. The order of these 
     * values must be maintained
     */
    public static ArrayList<Double> q2() {
    	System.out.println();
    	ArrayList<Double> listOfIntergers = new ArrayList<Double>();
    	listOfIntergers.add(11.36);
    	listOfIntergers.add(9.47);
    	listOfIntergers.add(-2.39);
    	System.out.println(listOfIntergers);
    	return listOfIntergers;
    }

    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 16, 18, 3, 12, and 15. You can assume the input ArrayList has 
     * size large enough to avoid an index out of bounds exception at these indices
     */
    public static int q3(ArrayList<Integer> inputList) {
        return inputList.get(16) + inputList.get(18) + inputList.get(3) + inputList.get(12) + inputList.get(15);
    }
    
    
    
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a new 
     * HashMap with keys of type Integer mapped to values of type Double containing the key-value 
     * pairs {37:5.62, 82:18.49, 69:16.94, 30:-4.76, 37:-6.66}
     */
    public static HashMap<Integer, Double> q4() {
    	HashMap<Integer, Double> x = new HashMap<Integer, Double>();
    	System.out.println();
    	x.put(37, 5.62);
    	x.put(82, 18.49);
    	x.put(69, 16.94);
    	x.put(30, -4.76);
    	x.put(37, -6.66);
    	System.out.println(x);
    	return x;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type String containing the key-value 
     * pairs {"slip":"cooperative", "homework":"clue", "respect":"basement", "solid":"counter"}
     */
    public static HashMap<String, String> q5() {
    	HashMap<String, String> mapOfStringsToDoubles = new HashMap<String, String>();
    	System.out.println();
    	
    	mapOfStringsToDoubles.put("slip", "cooperative");
    	mapOfStringsToDoubles.put("homework", "clue");
    	mapOfStringsToDoubles.put("respect", "basement");
    	mapOfStringsToDoubles.put("solid", "counter");
    	System.out.println(mapOfStringsToDoubles);
    	return mapOfStringsToDoubles;
    }
    
    
    
    public static void main(String[] args){
        q1();
        q2();
        q4();
        q5();
        /* Test your code here to verify it is correct before submitting */
        
    }
}
