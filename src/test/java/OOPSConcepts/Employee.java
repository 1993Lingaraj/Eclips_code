package OOPSConcepts;

public class Employee {
	int empid;
	String empname;
	int salary;
	int deptNo;
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptNo);
		
	}
	public static void main(String args[]) {
		
		//Assigning values to class variables using object - First method
		
		Employee emp1 =  new Employee(); // First Employee
		emp1.empid=101;
		emp1.empname="lingaraj";
		emp1.salary= 200000;
		emp1.deptNo=10;
		emp1.display();
		
		
		Employee emp2 =  new Employee(); // Second Employee
		emp2.empid=105;
		emp2.empname="Akasmita";
		emp2.salary= 300000;
		emp2.deptNo=13;
		emp2.display();
		
	}
	
	
	
	

}
