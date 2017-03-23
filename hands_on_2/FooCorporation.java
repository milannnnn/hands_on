package hands_on_2;

public class FooCorporation {

	public static void main(String[] args) {
		
		Employee John = new Employee();
		John.name = "John";
		John.base_pay = 7.5;
		John.hours = 38;
		John.salary();
		
		Employee Annabel = new Employee();
		Annabel.name = "Annabel";
		Annabel.base_pay = 8.2;
		Annabel.hours = 42;
		Annabel.salary();
		
		Employee Graham = new Employee();
		Graham.name = "Graham";
		Graham.base_pay = 10.5;
		Graham.hours = 41;
		Graham.salary();
				
		Manager Bill = new Manager();
		Bill.name = "Bill";
		Bill.base_pay = 15.5;
		Bill.hours = 39;
		Bill.office = "A332";
		Bill.salary();
		
		Manager Gregory = new Manager();
		Gregory.name = "Gregory";
		Gregory.base_pay = 18.2;
		Gregory.hours = 40;
		Gregory.office = "A415";
		Gregory.salary();
		
	}

}
