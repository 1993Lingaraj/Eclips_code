package OOPSConcepts;

public class Calculation {

	
	int a;
	int b;
	
	//1. methods may not takes any parameter - Empty Parameters
	
	/*void sum() {
		System.out.println(a+b);
		
	}
	
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		
	} */
	
	
	//2. methods takes any parameter
	/*void sum(int x, int y) {
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.sum(300,400);
		
	} */
	
   // 3. method return some values 
	
	int sum(){
		return (a+b);
		
		
	}
	public static void main(String[] args) {
		Calculation cal = new Calculation();
	cal.a=300;
	cal.b=500;
	int r = cal.sum();
	System.out.println(r);
	}
	
	
	// 4. method may not return some values
	
	/*void sum() {
		System.out.println(a+b);
		
	}
	
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		
	} */
}
