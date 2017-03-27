package hands_on_3;

public class FooCorporation2 {

	public static void main(String[] args) {
		
		Employee John = new Employee("John",8.5,35,'B');
		John.salary();
		
		Employee Annabel = new Employee("Annabel",9,37,'B');
		Annabel.salary();
		
		Employee Graham = new Employee("Graham",9.2,43,'A');
		Graham.salary();
		
		Employee Margaret = new Employee("Margaret",7.8,45,'B');
		Margaret.salary();
				
		Manager Bill = new Manager("Bill",15,49,'A',"A332");
		Bill.salary();
		
		Manager Gregory = new Manager("Gregory",16.5,47,'A',"A415");
		Gregory.salary();
		
	}

}
