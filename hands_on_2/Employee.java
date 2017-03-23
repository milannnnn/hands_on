package hands_on_2;

public class Employee {
	
	public String name;
	public double base_pay;
	public int    hours;
	
	public void salary(){
		System.out.println(name + "'s salary for this month is " + base_pay*hours + "$!");
	}
	
	public Employee(){}
	
	public Employee(String nm, double bp, int h){
		name = nm;
		base_pay = bp;
		hours = h;
	}
}
