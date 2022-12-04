package OOPSConcepts;

public class StaticExapmle {
      int a;   // non static 
     static int b;  // static method
     
    static void m1() {
    	 System.out.println("This is m1 - static method");
    	 
     }
      void m2() {
    	  
    	  System.out.println("This is m2 - Non static method");
      }
	
	void m3 () {
		a=500;
		b=1000;
		
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		b=100;
		System.out.println(b);
		m1();
		// a=200; non static variables - not accessible 
		// m2();        non static method - not accessible
		StaticExapmle se = new StaticExapmle();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		

	}

}
