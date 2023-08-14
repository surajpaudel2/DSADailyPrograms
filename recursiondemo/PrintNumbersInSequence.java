package recursiondemo;

import java.util.Scanner;

public class PrintNumbersInSequence
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		printNumbersInSequence(num);
	}

	private static void printNumbersInSequence(int num)
	{
		if(num == 0)
		{
			return;
		}
		printNumbersInSequence(num - 1);
		System.out.println(num);
	}
}
