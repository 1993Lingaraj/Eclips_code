package Arrays;

public class StringMethods {

	public static void main(String[] args) {
		  
		String s="Welcome";
		
		System.out.println(s.length());
		
		String s1= "Welcome to";
		String s2= " training";
		
		System.out.println(s1+ s2);
		System.out.println(s1.concat(s2));
		
		
		// Equals()
		
		String s3= "WELCOME";
		String s4= "welcome";
		
		System.out.println(s3.equals(s4)); //false
		
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		//contains()
		
		
		System.out.println(s3.contains("ABC")); //false
		
		
		
		// substring()
		
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(4,7));
		
		
		//Replace()
		
		
		
		
		
		

	}

}
