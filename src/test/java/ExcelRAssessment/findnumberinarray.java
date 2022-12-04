package ExcelRAssessment;

public class findnumberinarray {

	public static void main(String[] args) {
		int[] array = {2, 5, -3, -5, 43};

		int target = 5;

		for (int i = 0; i < array.length; i++) {
		    if (array[i] == target) {
		        System.out.println("yes,present");
		    }
		    else {
		    	 System.out.println("Not Present");
		    	 
		    }
		}

	}

}
