package hands_on_2;

public class FooCorporation {

	public static void main(String[] args) {
		
		Employee John = new Employee();
		John.name = "John";
		John.base_pay = 7.5;
		John.hours = 38;
		John.salary();
		
		Employee Annabel = new Employee("Annabel",8.2,42);
		Annabel.salary();
		
		Employee Graham = new Employee("Graham",10.5,41);
		Graham.salary();
				
		Manager Bill = new Manager();
		Bill.name = "Bill";
		Bill.base_pay = 15.5;
		Bill.hours = 39;
		Bill.office = "A332";
		Bill.salary();
		
		Manager Gregory = new Manager("Gregory",18.2,40,"A415");
		Gregory.salary();
		
	}

}
