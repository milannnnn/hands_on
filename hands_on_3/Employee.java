package hands_on_3;

public class Employee {
	
	public String name;
	public double base_pay;
	public int    hours;
	public char   pro_lvl;
	
	public void salary(){
		//double bp = ((base_pay<8.0)?8.0:base_pay);
		
		if(base_pay>=8.0){
		double tot_salary = ((hours<=40)?hours:40+(hours-40)*1.5)*base_pay;
		//System.out.println(name + "'s salary for this month is " + tot_salary + "$!");
		System.out.printf("%s's salary for this month is %.2f $!\n", name, tot_salary);
		}
		else{
			System.out.println("MIN WAGE ERROR (Indian Detected) -> " + name + "!!!");
		}
	}
	
	public String office(){
		if(pro_lvl=='A'){
			return "Individual";
		}
		else{
			return "Cubicle";
		}
	}
	
	public Employee(){}
	
	public Employee(String nm, double bp, int h, char p){
		this.name = nm;
		this.base_pay = bp;
		this.hours = h;
		this.pro_lvl = p;
	}
}
