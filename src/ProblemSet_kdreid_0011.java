public class ProblemSet_kdreid_0011{
    
    
    /**
     * q1: Write a public static method named q1 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the absolute value of the first input 
     * subtracted by the the square root of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
	public static double q1(double input1, double input2) {
    	return  Math.abs(input1) - Math.sqrt(input2);
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes two ints as parameters representing a 
     * 2d point (The first parameter is the x-value, second is the y-value) and returns a double. 
     * The return value shall be the Euclidean distance between the input point and the point (1, 
     * 1). 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q2(int input1, int input2)  {
    	return Math.abs(Math.sqrt(Math.pow(input1 - 1, 2)+Math.pow(input2 - 1, 2)));
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "t", "r", and "e".
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
   
    public static int q3(String input) {
	    	input = input.replaceAll("t", "");
	    	input = input.replaceAll("r", "");
	    	input = input.replaceAll("e", "");
	    	return input.length();
	 }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a String as a parameter and returns 
     * an int. The return value is the total number of times "c" and "i" appear in the input 
     * String.
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static int q4(String input) {
    	input = input.replaceAll("a", "");
    	input = input.replaceAll("b", "");
    	input = input.replaceAll("d", "");
    	input = input.replaceAll("e", "");
    	input = input.replaceAll("f", "");
    	input = input.replaceAll("g", "");
    	input = input.replaceAll("h", "");
    	input = input.replaceAll("j", "");
    	input = input.replaceAll("k", "");
    	input = input.replaceAll("l", "");
    	input = input.replaceAll("m", "");
    	input = input.replaceAll("n", "");
    	input = input.replaceAll("o", "");
    	input = input.replaceAll("p", "");
    	input = input.replaceAll("q", "");
    	input = input.replaceAll("r", "");
    	input = input.replaceAll("s", "");
    	input = input.replaceAll("t", "");
    	input = input.replaceAll("u", "");
    	input = input.replaceAll("v", "");
    	input = input.replaceAll("w", "");
    	input = input.replaceAll("x", "");
    	input = input.replaceAll("y", "");
    	return input.length();
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all upper case 
     * letters then replace all instances of the character 'S' with the character 'N'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q5(String input) {
    	String x = input.toUpperCase();
    	return x.replace('S', 'N');
    }
   
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
