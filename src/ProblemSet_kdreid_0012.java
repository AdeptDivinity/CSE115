import java.util.ArrayList;
import java.util.HashMap;
public class ProblemSet_kdreid_0012{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns an 
     * ArrayList of type Double containing the values 10.43, 12.23, and 1.24. The order of these 
     * values must be maintained
     */
	public static ArrayList<Double> q1(){
        ArrayList<Double> listOfDoubles = new ArrayList<Double>();
        listOfDoubles.add(10.43);
        listOfDoubles.add(12.23);
        listOfDoubles.add(1.24);
        return listOfDoubles;
    }
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 16, 7, and 14. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
	public static int q2(ArrayList<Integer> inputList) {
        
        
        return inputList.get(16) + inputList.get(7) + inputList.get(14);
      
    }
    
    
    
    private static int get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	/**
     * q3: Write a public static method named q3 that takes no parameters and returns an 
     * ArrayList of type Integer containing the values 6, 4, -4, 0, and 9. The order of these 
     * values must be maintained
     */
   public static ArrayList<Integer> q3() {
    	ArrayList<Integer> listOfIntergers = new ArrayList<Integer>();
    	listOfIntergers.add(6);
    	listOfIntergers.add(4);
    	listOfIntergers.add(-4);
    	listOfIntergers.add(0);
    	listOfIntergers.add(9);
    	return listOfIntergers;
    }

    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Integer containing the key-value 
     * pairs {"flag":49, "produce":22}
     */
    public static HashMap<String, Integer> q4() {
    	HashMap<String, Integer> mapOfStringsToDoubles = new HashMap<String, Integer>();
    	System.out.println();
    	
    	mapOfStringsToDoubles.put("flag", 49);
    	mapOfStringsToDoubles.put("produce", 22);
    	System.out.println(mapOfStringsToDoubles);
    	return mapOfStringsToDoubles;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Integer containing the key-value 
     * pairs {"clean":10, "carbohydrate":50}
     */
    public static HashMap<String, Integer> q5() {
    	HashMap<String, Integer> mapOfStringsToDoubles = new HashMap<String, Integer>();
    	System.out.println();
    	
    	mapOfStringsToDoubles.put("clean", 10);
    	mapOfStringsToDoubles.put("carbohydrate", 50);
    	System.out.println(mapOfStringsToDoubles);
    	return mapOfStringsToDoubles;
    }
    
    
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        int y = q2(x);
    	System.out.println(y); 
        q4();
        q5();
        /* Test your code here to verify it is correct before submitting */
        
    }




}
