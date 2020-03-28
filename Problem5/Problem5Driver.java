import java.util.Scanner;
class Problem5Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size:");
		int n = sc.nextInt();
		Test obj = new Test(n);
		obj.setArrayElement();

		System.out.println("Largest Element in Array: " +obj.largestElement());
		System.out.println("Smallest Element in Array: " +obj.smallestElement());
		
	}
}