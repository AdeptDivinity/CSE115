public class ProblemSet_kdreid_0015{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns void. The 
     * method should print all the integers from -4 to 28 to the screen. The output should be 
     * inclusive of these end points
     */
	public static void q1() {
		int x = -4;
		while(x<=28){
		System.out.print(x + " ");
		x = x + 1;
		}
	}
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 3 characters, return "short"
     * If the input String has 3 or more characters but less than 12, return "medium"
     * If the input String has greater than or equal to 12 characters, return "long"
     * If the input String contains any instances of the letter 'v', return "found v" regardless 
     * of the length of the input
     */
	public static String q2(String input) {
    	boolean test1 = input.contains("v");
    	int test2 = input.length();
    	String x;
    	if(test1) {
    		x = "found v";
    	}else if(test2 == 0) {
    		x = "empty";
    	}else if(test2 < 3) {
    		x = "short";
    	} else if(test2 < 12) {
    		x = "medium";
    	} else {
    		x = "long";
    	}
    return x;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns void. The 
     * method should print all the integers from 5 to 199 to the screen. The output should be 
     * inclusive of these end points
     */
    
	public static void q3() {
		int x = 5;
		while(x<=199){
		System.out.print(x + " ");
		x = x + 1;
		}
	}
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns void. The 
     * method should print all the integers from -9 to 9 to the screen. The output should be 
     * inclusive of these end points
     */
    
	public static void q4() {
		int x = -9;
		while(x<=9){
		System.out.print(x + " ");
		x = x + 1;
		}
	}
    
    
    /**
     * q5: Write a public static method named q5 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is equal to 27 and the second parameter is equal to 4
     */
	public static boolean q2(int x, int y) {
    	boolean xcomp = x == 27;
    	boolean ycomp = y == 4;
    	return xcomp && ycomp;
    }
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
