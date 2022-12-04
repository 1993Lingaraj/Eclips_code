package Arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		//int a[]=new int[5]; //with this notation we can't store more than 5 element
		
		int a[]= {100,200,300,400,500};  // we can store any no of elements
		
		int sum=0;
		
		for(int i:a) {
			System.out.println(i);
					sum=sum+i;
				}
				System.out.println(sum);
	}

}
