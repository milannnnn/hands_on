package hands_on_2;

public class Manager extends Employee {
	
	public String office;
	
	public void salary(){
		System.out.println("The salary of this managing piece of shit (" + name + 
						   " from " + office + ") is " + base_pay*hours + "$!");
	}

	public Manager(){}
	
	public Manager(String nm, double bp, int h, String off){
		super(nm,bp,h); // Refers the Constructor from the Extended Class (Employee)!!!
		office = off;
	}
}
