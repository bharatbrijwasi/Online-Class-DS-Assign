import java.util.Scanner;
class Test
{
	private int arr[];
	boolean found = false;
	Scanner sc = new Scanner(System.in);
	public Test(int arrSize)
	{
		arr = new int[arrSize];
	}

	public void setArrayElement()
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public boolean getSearched(int sElement)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == sElement)
			{
				found = true;
				break;
			}

			else
			{
				found = false;
			}
		}
		return found;
	}
}
