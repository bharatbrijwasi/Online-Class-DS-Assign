import java.util.Scanner;
public class Problem1Driver
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
			System.out.println("Element not found...");
		}
	}
}
