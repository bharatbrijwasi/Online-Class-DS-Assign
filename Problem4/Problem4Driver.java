//Write a program to find the biggest element from the given array
import java.util.Scanner;
public class Problem4Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		Test obj = new Test(n);
		obj.setArray();
		System.out.println("Max Element in Array: " +obj.maxElement());
	}
}