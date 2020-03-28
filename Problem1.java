import java.util.Scanner;
class Test
{
	Scanner sc = new Scanner(System.in);
	private int arr[];
	public Test(int arrSize)
	{
		arr = new int[arrSize];
	}

	public void setArrayElement()
	{
		for(int i = 0; i <= arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
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
	}
}