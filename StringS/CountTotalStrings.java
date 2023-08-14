package StringS;

import java.util.Scanner;

public class CountTotalStrings
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your string : ");
//		int totalWords = countTotalWords(sc.nextLine());
//		System.out.println(totalWords);
		
		String str = "Suraj Paudel";
		System.out.println(str.split(" ").length);
	}
	
	public static int countTotalWords(String str)
	{
		if(str.trim().equals("") || str == null)
		{
			return 0;
		}
		
		String str2 = str.trim();
		int count = 0;
		boolean isSpaceFound = false;
		
		for(int i = 0; i<str2.length(); i++)
		{
			if(str2.charAt(i) == ' ' && !isSpaceFound)
			{
				isSpaceFound = true;
				count ++;
			}
			
			if(str2.charAt(i) != ' ')
			{
				isSpaceFound = false;
			}
		}
		return count + 1;
	}
}
