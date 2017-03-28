package hands_on_3;

import java.util.ArrayList;

public class FooCorporation {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(    "John", 8.5, 35, 'B'));
		employees.add(new Employee( "Annabel",   9, 37, 'B'));
		employees.add(new Employee(  "Graham", 9.2, 43, 'A'));
		employees.add(new Employee("Margaret", 7.8, 45, 'B'));
		
		// for (int i=0;i<employees.size();i++){
		// 	employees.get(i).salary();
		// }
		
		for(Employee emp : employees){
			emp.salary();
		}
		
		ArrayList<Manager> managers = new ArrayList<Manager>();
		
		managers.add(new Manager("Bill",15,49,'A',"A332"));
		managers.add(new Manager("Gregory",16.5,47,'B',"A415"));
		
		/*
		String[] manNames = {"Bill", "Gregory"};
		char[] 	 manLevel = {'A', 'B'};
		double[] manPay = {15.0, 16.5};
		int[] 	 manHours = {49, 47};
		String[] manOfficeNumber = {"A332", "A415"};
		for(int i=0; i<manNames.length; i++){
			managers.add(new Manager(manNames[i], manPay[i], manHours[i],manLevel[i], manOfficeNumber[i]));
		}
		*/
		
		for(Manager man : managers){
			man.salary();
			man.hasOffice();
		}
		
		employees.remove(2);
		// Margaret takes 2nd place instead of Graham
		System.out.println(employees.get(2).name);
	}

}
