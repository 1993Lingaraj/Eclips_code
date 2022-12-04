package Arrays;

public class ArrayExample1 { 

	public static void main(String[] args) {
		
		int a[]= new int[10]; // Deceleration of array with 5 elements
		//store elements in to an array 
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		
		// read elements from an array
		
		/* for(int i=0; i<=4;i++) {
			
			System.out.println(a[i]); // 10, 20 ,30,40,.......
			
		}
		*/
		
		// for...each loop
		
		for(int i:a) {
			System.out.println(i);
		}
		
				
		
	}

}
