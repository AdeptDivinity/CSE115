public class Lab2 {
	
	
	public static double flightTime(double angle, double iVelocity) {
		return (2*iVelocity * Math.sin(Math.toRadians(angle)))/9.81;
	}
	
	

	 public static void main(String[] args){
		double y = flightTime(10,160);
	System.out.print(y);
	 }
}

