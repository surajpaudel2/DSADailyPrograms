package recursiondemo;

import java.util.Scanner;

public class ArraySum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int [] arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter element "+ (i + 1));
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Total sum of an array "+ findArraySum(arr, 0));
	}
	
	public static int findArraySum(int[] arr, int intitalPoint)
	{
		if(intitalPoint == arr.length)
		{
			return 0;
		}
		
		return arr[intitalPoint] + findArraySum(arr, intitalPoint + 1); 
	}
}
