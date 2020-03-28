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

class Problem1Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Element to be added:");
		int n = sc.nextInt();

		Test obj = new Test(n);
		obj.setArrayElement();

		System.out.print("Enter Element to be Searched: ");
		int searchElement = sc.nextInt();

		if(obj.getSearched(searchElement) == true)
		{
			System.out.println("Element found...");
		}

		else
		{
			System.out.println("Element not found ...");
		}
	}
}