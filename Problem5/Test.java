//Write a program to find the smallest and the largest element from an array.
import java.util.Scanner;
class Test
{
	private int arr[];
	public Test(int arrSize)
	{
		arr = new int[arrSize];
	}
	
	Scanner sc = new Scanner(System.in);
	public void setArrayElement()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public int largestElement()
	{
		int max = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}

		return max;
	}

	public int smallestElement()
	{
		int min = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
}