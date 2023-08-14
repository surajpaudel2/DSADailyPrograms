package recursiondemo;

import java.util.Scanner;

public class FindElementInAnArray 
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
		
		System.out.println("Enter the number you want to search : ");
		int num = sc.nextInt();
		
		System.out.println(findElementInAnArray(arr, 0, num));
	}

	private static boolean findElementInAnArray(int[] arr, int size, int num)
	{
		if(size == arr.length)
		{
			return false;
		}
		if(arr[size] == num)
		{
			return true;
		}
		
		return findElementInAnArray(arr, size + 1, num);
	}
}
