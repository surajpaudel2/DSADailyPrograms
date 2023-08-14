package recursiondemo;

import java.util.Scanner;

public class RemoveXFromString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value : ");
		String input = sc.next();
		
		System.out.println(removeXFromString(input));
	}

	private static String removeXFromString(String input)
	{
		if(input.length() == 0)
		{
			return input;
		}
		
		if(input.charAt(0) == 'x')
		{
			return removeXFromString(input.substring(1));
		}
		else
		{
			return input.charAt(0) + removeXFromString(input.substring(1));
		}
	}
}
