import java.util.ArrayList;
import java.util.HashMap;

public class Algorithms{
	
	
	public static int q1(ArrayList<Integer> numbers) {

		int max = Integer.MIN_VALUE;
    for(int value : numbers){
        if(value > max) {
        	max = value;
        }else {
        	System.out.print("No Input");
        }

    }
    return max;
	}
	 public static void main(String[] args){
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(32);
		    numbers.add(79);
		    numbers.add(100);
		    numbers.add(53);
		    System.out.print(q1(numbers));
		    
	 }
}
    
    
    
