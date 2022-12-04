package ExcelRAssessment;

public class averageofanarray {

	public static void main(String[] args) {
		int [] values = {12, 6, 4, 2};
        int sum = 0;
        
         for (int i=0; i < values.length; i++) { 
        	 sum += values[i]; 
        	 } 
         int average = sum / values.length;
         
        System.out.println("output:"+  average);
	}

}
