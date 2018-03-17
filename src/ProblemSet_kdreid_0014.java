public class ProblemSet_kdreid_0014{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns void. The 
     * method should print all the integers from 3 to 121 to the screen. The output should be 
     * inclusive of these end points
     */
	public static void q1() {
		int x = 3;
		while(x<=121){
		System.out.print(x + " ");
		x = x + 1;
		}
	}
    
    
    /**
     * q2: Write a public static method named q2 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is greater than or equal to -8 or the second parameter is less than 9
     */
    public static boolean q2(int x, int y) {
    	boolean xcomp = x >= -8;
    	boolean ycomp = y < 9;
    	return xcomp || ycomp;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 5 characters, return "short"
     * If the input String has 5 or more characters but less than 15, return "medium"
     * If the input String has greater than or equal to 15 characters, return "long"
     * If the input String contains any instances of the letter 'p', return "found p" regardless 
     * of the length of the input
     */
    public static String q3(String input) {
    	boolean test1 = input.contains("p");
    	int test2 = input.length();
    	String x;
    	if(test1) {
    		x = "found p";
    	}else if(test2 == 0) {
    		x = "empty";
    	}else if(test2 < 5) {
    		x = "short";
    	} else if(test2 < 15) {
    		x = "medium";
    	} else {
    		x = "long";
    	}
    return x;
    }
    
    
    
    
    

	/**
     * q4: Write a public static method named q4 that takes no parameters and returns void. The 
     * method should print all the integers from 4 to 162 to the screen. The output should be 
     * inclusive of these end points
     */
    public static void q4() {
		int x = 4;
		while(x<=162){
		System.out.print(x + " ");
		x = x + 1;
		}
	}

    
    
    
    /**
     * q5: Write a public static method named q5 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is less than 14 or the second parameter is less than or equal to 9
     */
    public static boolean q5(int x, int y) {
    	boolean xcomp = x < 14;
    	boolean ycomp = y <= 9;
    	return xcomp || ycomp;
    }
    
    
    
    public static void main(String[] args){
        q1();
        boolean result1 = q2(-10, 100);
        System.out.print(result1);
        String y = q3("hellp");
        System.out.println(y);
        q4();
        boolean result2 = q2(-10, 100);
        System.out.print(result2);
        /* Test your code here to verify it is correct before submitting */
        
    }
}
