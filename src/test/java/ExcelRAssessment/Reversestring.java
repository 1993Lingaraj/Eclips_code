package ExcelRAssessment;

public class Reversestring {

	public static void main(String[] args) {
		
		String input = "ajay";
	    String rStr = "";
	    System.out.println("string: " + input);
	        
	    for (int i = 0; i <input.length(); i++) {
	    	rStr = input.charAt(i) + rStr;
	      
	    }
	    
	    System.out.println("Rstring: "+ rStr);
		

	}

}
