import java.util.Scanner;
class Test
{
	int arr[];

	public Test(int n)
	{
		arr = new int[n];
	}

	Scanner sc = new Scanner(System.in);
	public void setArray()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public int maxElement()
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