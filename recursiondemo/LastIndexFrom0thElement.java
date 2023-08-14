package recursiondemo;

public class LastIndexFrom0thElement
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 4, 5, 3, 22, 3, 3, 13, 1333};
		System.out.println(findLastIndex(arr, 3, 0));
	}
	
	public static int findLastIndex(int [] arr, int num, int index)
	{
		if(index == arr.length)
		{
			return -1;
		}
		
		int k = findLastIndex(arr, num, index + 1);
//		System.out.println(index + "   "+ arr[index]);
		if(k != -1)
		{
			return k;
		}
		else
		{
			if(arr[index] == num)
			{
				return index;
			}
			else
			{
				return -1;
			}
		}
		
	}
}
