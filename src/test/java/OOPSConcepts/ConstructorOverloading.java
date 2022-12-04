package OOPSConcepts;

public class ConstructorOverloading {
	
	int a =0;
	int b =0;
	double c =0;
	
	ConstructorOverloading(){   // first 
		a=10;
		b=20;
		c=30.55;	
	}
	ConstructorOverloading(int x, int y ){ // second
		
		a=x;
		b=y;
		
	}
	
	ConstructorOverloading(int x, double y){ // Third
		a=x;
		c=y;
	}
	ConstructorOverloading(int x, int y, double z){ // fourth
		a=x;
		b=y;
		c=z;
	}
	
	ConstructorOverloading(int x, double y, int z){ // fifth
		a=x;
		b=z;
		c=y;
	}
   void display() {
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
   }
   
	public static void main(String[] args) {
		
		// ConstructorOverloading co = new ConstructorOverloading(); //first constructor
		// ConstructorOverloading co = new ConstructorOverloading(10, 20);  //second constructor
		// ConstructorOverloading co = new ConstructorOverloading(10,20,3);//Third constructor
		// ConstructorOverloading co = new ConstructorOverloading(10,40,54.5);// Fourth constructor
		ConstructorOverloading co = new ConstructorOverloading(10,40.55,54); // fifth constructor
		co.display(); 
		 
	}

}
