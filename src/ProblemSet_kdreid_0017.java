import java.util.ArrayList;
import java.util.HashMap;

 public class ProblemSet_kdreid_0017{
    
    
    /**
     * q1: Write a public static method named q1 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is less than or equal to 5 or the second parameter is greater than 9
     */
	public static boolean q1(int x, int y) {
    	boolean xcomp = x <= 5;
    	boolean ycomp = y > 9;
    	return xcomp || ycomp;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a HashMap with Strings as keys and 
     * Strings as values as a parameter and returns a single String. The String returned will be 
     * the concatenation of the Strings "camp", "home", "echo", and "pull" followed by all of the 
     * keys from the input HashMap. Each String concatenated into the return String must be 
     * separated by a single space
     */
	public static String q2(HashMap<String, String> inputList) {
		String x = "";
		for(int i=0; i<inputList.size() ;i++) {
		 x = "camp" +" "+ "home" + " "+ "echo" + " "+ "pull"+ inputList.keySet();
		}String y= x.replaceAll(",","").replace('[', ' ').replaceAll("]","");
		return y;
	}
    
    
    /**
     * q3: Write a public static method named q3 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 5 characters, return "short"
     * If the input String has 5 or more characters but less than 13, return "medium"
     * If the input String has greater than or equal to 13 characters, return "long"
     * If the input String contains any instances of the letter 'q', return "found q" regardless 
     * of the length of the input
     */
	public static String q3(String input) {
    	boolean test1 = input.contains("q");
    	int test2 = input.length();
    	String x;
    	if(test1) {
    		x = "found q";
    	}else if(test2 == 0) {
    		x = "empty";
    	}else if(test2 < 5) {
    		x = "short";
    	} else if(test2 < 13) {
    		x = "medium";
    	} else {
    		x = "long";
    	}
    return x;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of Strings as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the length of each element and compute the average of all of these values. Your 
     * method will then return the cube of this average
     */
    public static double q4(ArrayList<String> inputList) {
    	double x = 0.0;
    	for(int i=0; i<inputList.size() ;i++) {
    		 x = x + inputList.get(i).length();
    	}double z = Math.pow(x/inputList.size(), 3);
    	return z;
    }
    	
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain all 
     * values from the input ArrayList except those that have a square within 87.0 of 322.44 (ie. 
     * the target value of the square is 322.44 and the allowed variance from this target is 
     * 87.0)
     */
    public static ArrayList<Double> q5(ArrayList<Double> inputList) {
    	ArrayList<Double> newList = new ArrayList<Double>();
    	for(int i=0; i<inputList.size() ;i++) {
    		if(Math.pow(inputList.get(i),2)<409.44) {
    			continue;
    		}newList.add((inputList.get(i)));
    	}
    return newList;
    }
    
    
    
    public static void main(String[] args){
        
        HashMap<String,String> x = new HashMap<String, String>();
        x.put("apple", "pie");
        x.put("pizza", "ham");
        String y = q2(x);
        System.out.println(y);
        /* Test your code here to verify it is correct before submitting */
        
    }
}
