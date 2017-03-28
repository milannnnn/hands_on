package hands_on_3;

import java.util.ArrayList;

public class FooCorporation {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("John",8.5,35,'B'));
		employees.add(new Employee("Annabel",9,37,'B'));
		employees.add(new Employee("Graham",9.2,43,'A'));
		employees.add(new Employee("Margaret",7.8,45,'B'));
		
		for (int i=0;i<employees.size();i++){
			employees.get(i).salary();
		}
		
		ArrayList<Manager> managers = new ArrayList<Manager>();
		
		managers.add(new Manager("Bill",15,49,'A',"A332"));
		managers.add(new Manager("Gregory",16.5,47,'B',"A415"));
		
		for (int i=0;i<managers.size();i++){
			managers.get(i).salary();
			managers.get(i).hasOffice();
		}
		
		employees.remove(2);
		System.out.println(employees.get(2).name); // Margaret instead of Graham
	}

}
