public class ProblemSet_kdreid_0009{
    
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all lower case 
     * letters then replace all instances of the character 'e' with the character 's'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q1(String input) {
    	String x = input.toLowerCase();
    	return x.replace('e', 'o');
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all lower case 
     * letters then replace all instances of the character 'u' with the character 's'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q2(String input) {
    	String x = input.toLowerCase();
    	return x.replace('u', 's');
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the cosine of the first input subtracted by 
     * the the tangent of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q3(double input1, double input2) {
    	return  Math.cos(input1) - Math.tan(input2);
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the square root of the first input subtracted 
     * by the the cosine of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    
    public static double q4(double input1, double input2) {
    	return  Math.pow(input1, 2) - Math.cos(input2);
    }
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "o", "x", and "c".
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q5(String input) {
    	input = input.replaceAll("o", "");
    	input = input.replaceAll("x", "");
    	input = input.replaceAll("c", "");
    	
    	return input;
    }
    
    
    
    public static void main(String[] args){
        
  
        /* Test your code here to verify it is correct before submitting */
        
    }



	private static char[] length(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
