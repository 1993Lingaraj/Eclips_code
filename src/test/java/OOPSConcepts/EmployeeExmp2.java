package OOPSConcepts;

public class EmployeeExmp2 {
	
	int empid;
	String empname;
	int salary;
	int deptNo;
	
	/*EmployeeExmp2 (int id,String name,int sal, int dno){
		
		empid=id;
		empname=name;
		salary=sal;
		deptNo=dno;
		
}*/
	void setdata(int id,String name,int sal, int dno) {
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
		//Assigning values to class variables using method
		
		EmployeeExmp2 emp1 = new EmployeeExmp2();
		emp1.setdata(101,"Lingaraj",30000,10);
		emp1.display();
		
		EmployeeExmp2 emp2 = new EmployeeExmp2();
		emp2.setdata(103,"Akasmita",40000,15);
		emp2.display();
		
		
		
	}
}
