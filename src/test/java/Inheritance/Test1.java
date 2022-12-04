package Inheritance;

class A{
	int a;
	int b;
	public void dispaly() {
		System.out.println(a+b);
	}	
}

class B extends A
{
	int x;
	int y;
	public void show() {
		System.out.println(x+y);
	}
		
		
	}

public class Test1 
{
	

	public static void main(String[] args) {
		A aobj= new A();
		aobj.a=100;
		aobj.b=200;
		aobj.dispaly();
		
		B bobj= new B();
		bobj.x=10;
	    bobj.y=20;
		bobj.show();
		
		bobj.a=150;
		bobj.b=250;
		bobj.dispaly();
			
	}

}
