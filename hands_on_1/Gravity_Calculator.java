package hands_on_1;

public class Gravity_Calculator { 
	   
	public static double multi(double x, int y){ 
	// method for multiplication 
		return x*y;
    } 

	// add 2 more methods for powering to square and summation (similar to multiplication) 
	public static double summ(double... xs){ 
	// method for multiplication 
		double sum = 0;
		for (double x : xs){
		sum += x;
		}
		return sum;
    } 
	public static int power(int x){ 
	// method for multiplication 
		return x*x;
    } 	
	
	public static void outline(double x, int t){ 
	// method for printing out a result 
	System.out.println("The object's position after " + t + " seconds is " 
				       + x + " m."); 
    } 

	public static void main(String[] args) {
	// compute the position and velocity of an object with defined methods and print out the 
	double g  = -9.81;
	double v0 = 0;
	double s0 = 0;
	int t    = 10;
	outline(summ(multi(-g*0.5,power(t)),multi(v0,t),s0),t);
    } 
}