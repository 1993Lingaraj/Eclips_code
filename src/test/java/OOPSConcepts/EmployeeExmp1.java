package OOPSConcepts;

public class EmployeeExmp1 {
	int empid;
	String empname;
	int salary;
	int deptNo;
	
	EmployeeExmp1 (int id,String name,int sal, int dno){
		
		empid=id;
		empname=name;
		salary=sal;
		deptNo=dno;
		
	}
	
	
	void display(){
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptNo);
		
	}
		
	public static void main(String args[])
	{
		
		// Assigning values to class variables using constructor - Second method
		
		EmployeeExmp1 emp1 = new EmployeeExmp1(101,"lingaraj",20000,10);
		emp1.display();
		
		EmployeeExmp1 emp2 = new EmployeeExmp1(102,"Akasmita",30000,11);
		emp2.display();
		
		
	}

}
