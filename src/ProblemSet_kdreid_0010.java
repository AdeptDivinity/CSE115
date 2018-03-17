public class ProblemSet_kdreid_0010{
    
    
    /**
     * q1: Write a public static method named q1 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the tangent of the first input added to the 
     * the sine of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
	 public static double q1(double input1, double input2) {
	    	return  Math.tan(input1) + Math.sin(input2);
	    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all lower case 
     * letters then replace all instances of the character 'k' with the character 'i'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
	 public static String q2(String input) {
	    	String x = input.toLowerCase();
	    	return x.replace('k', 'i');
	    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all upper case 
     * letters then replace all instances of the character 'K' with the character 'U'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
	 public static String q3(String input) {
	    	String x = input.toUpperCase();
	    	return x.replace('K', 'U');
	    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "x", "e", and "d".
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static int q4(String input) {
	    	input = input.replaceAll("x", "");
	    	input = input.replaceAll("e", "");
	    	input = input.replaceAll("d", "");
	    	return input.length();
	    	
	 }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the cosine of the first input to the power of 
     * the the cosine of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
	 
    public static double q5(double input1, double input2) {
    	return  Math.pow(Math.cos(input1), Math.cos(input2));
    }
    
    public static void main(String[] args){
     
        /* Test your code here to verify it is correct before submitting */
        
    }
}
