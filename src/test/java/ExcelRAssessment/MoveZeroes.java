package ExcelRAssessment;

public class MoveZeroes {

	public int[] solve(int[] inputArr)  
	{
		int size = inputArr.length; 
		int auxiliaryArray[] = new int[size];
		int zeroCount = 0; 
		int outputIndex = 0;  
		for(int i = 0; i < size; i++)  
		{  
		if(inputArr[i] != 0)  
		{  
			auxiliaryArray[outputIndex] = inputArr[i];  
			outputIndex = outputIndex + 1;  
			}  
			else  
			{  
				zeroCount = zeroCount + 1;  
			}  
			}  
			  
			while(zeroCount != 0)  
			{  
				auxiliaryArray[outputIndex] = 0;  
				outputIndex = outputIndex + 1;  
				zeroCount = zeroCount - 1;  
				}  
				return auxiliaryArray;  
				}  
	public static void main(String[] argvs)   
	{  
		MoveZeroes obj = new MoveZeroes(); 
		int arr[] = {0, 1, 0, 3, 12};  
		int size = arr.length;  
		int ans[] = obj.solve(arr);  
		System.out.println("For the following array: ");  
		for(int i = 0; i < size; i++)  
		{  
		System.out.print(arr[i] + " ");  
		}  
		System.out.println();  
		System.out.println("The answer after moving the zero at the end is: ");  
		for(int i = 0; i < size; i++)  
		{  
		System.out.print(ans[i] + " ");  
		}  
		System.out.println();  	
}
	}
