package Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String s[]=new String[3];
		
		s[0]="Welcome";
		s[1]="Lingaraj";
		s[2]="to this training";
		
		System.out.println(s.length); //returns the length of an array
		
		for (String i:s) {
			
			System.out.println(i);
			
		}
		

	}

}
