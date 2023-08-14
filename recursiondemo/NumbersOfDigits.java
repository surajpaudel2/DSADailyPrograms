/*
 * You are given a number 'n'.


Return number of digits in ‘n’.
 */
package recursiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersOfDigits
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(NumbersOfDigits.findTotalNumber(num));
	}
	
	public static int findTotalNumber(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		
		return 1 + findTotalNumber(num / 10);
	}
}
