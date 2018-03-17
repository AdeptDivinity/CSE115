import java.util.HashMap;


public class Lab3{
    public static double  q1(HashMap<String, Integer> cart3){
    	HashMap<String, Double> cart1 = new HashMap<String, Double>();
    	double sum = 0.0;
    	cart1.put("eggs", 1.79);
    	cart1.put("orange juice", 2.5);
    	cart1.put("yogurt", 1.99);
    	cart1.put("bread", 2.49);
    	cart1.put("butter", 2.39);
    	cart1.put("peppers", 1.49);
    	cart1.put("chips", 2.95);
    	cart1.put("chocolate chips", 2.39);
    	cart1.put("popcorn", 1.99);
    	cart1.put("tomato sauce", 0.99);
    	cart1.put("frozen pizza", 5.49);
    	cart1.put("milk", 2.09);
    	cart1.put("bananas", 0.49);
    	cart1.put("hot dog", 1.29);
    	cart1.put("relish", 0.99);
    	cart1.put("frozen dinner", 2.50);
    	cart1.put("cereal", 3.25);
    	cart1.put("tuna fish", 0.99);
    	cart1.put("coffee", 2.00);
    	cart1.put("pasta", 0.99);
    	cart1.put("strawberries", 3.50);
    	cart1.put("apples", 1.29);
    	cart1.put("sugar", 1.99);
    	cart1.put("ketchup", 2.89);
    	for (String key : cart1.keySet()) {
    	    double value1 = cart1.get(key);
    	    double value2 = cart3.get(key);
    	    sum += value1 * value2;
    	}
    	return sum ;
    }
    
    
    
    
    
    public static void main(String[] args){
        HashMap<String, Integer> cart = new HashMap<String, Integer>();
        cart.put("eggs", 2);

        cart.put("orange juice", 7);

        cart.put("yogurt", 6);

        cart.put("bread", 6);

        cart.put("butter", 1);

        cart.put("chips", 4);

        cart.put("chocolate chips", 1);

        cart.put("popcorn", 2);

        cart.put("tomato sauce", 2);

        cart.put("frozen pizza", 3);

        cart.put("milk", 7);

        cart.put("bananas", 1);

        cart.put("hot dog", 3);

        cart.put("relish", 3);

        cart.put("frozen dinner", 3);

        cart.put("cereal", 1);

        cart.put("tuna fish", 3);

        cart.put("coffee", 2);

        cart.put("pasta", 7);

        cart.put("strawberries", 3);

        cart.put("apples", 7);

        cart.put("sugar", 6);

        cart.put("ketchup", 4);
        double result = q1(cart);
        System.out.print(result);
        /* Test your code here to verify it is correct before submitting */
        
    }
}
