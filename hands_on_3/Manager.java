package hands_on_3;

public class Manager extends Employee {
	
	public String office_name;
	
	public void hasOffice(){
		if(office()=="Individual"){
			System.out.println("This rich motherfucker ("+name+" from "+office_name
					           +") even has an office!!!");
		}
		else{
			System.out.println("This manager ("+name+" from "+office_name
					            +") is a freaking hobo!!!");
		}
	}
	
	public Manager(){}
	
	public Manager(String nm, double bp, int h, char pro, String off){
		super(nm,bp,h,pro); // Refers the Constructor from the Extended Class (Employee)!!!
		office_name = off;
	}
}
